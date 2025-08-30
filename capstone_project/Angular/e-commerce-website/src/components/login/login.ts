import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { AuthService } from '../../services/auth-service';
import { UserDTO } from '../../interfaces/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  loginForm: FormGroup;
  isSignupMode: boolean = false;
  toastMessage: string | null = null;
  toastType: 'success' | 'error' = 'success';

  constructor(private fb: FormBuilder, private authService: AuthService, private router: Router) {
    this.loginForm = this.fb.group({
      username: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      address: [''],
      role: ['CUSTOMER'],
    });
  }

  // Toast functions
  showToast(message: string, type: 'success' | 'error' = 'success') {
    this.toastMessage = message;
    this.toastType = type;

    // Auto hide after 3 sec
    setTimeout(() => {
      this.toastMessage = null;
    }, 3000);
  }

  closeToast() {
    this.toastMessage = null;
  }

  login() {
    if (this.loginForm.get('email')?.valid && this.loginForm.get('password')?.valid) {
      const userDTO: UserDTO = {
        email: this.loginForm.get('email')?.value,
        password: this.loginForm.get('password')?.value,
      };

      this.authService.login(userDTO).subscribe({
        next: (res) => {
          this.authService.storeToken(res.token);

          // Fetch user data after successful login
          this.authService.getCurrentUser().subscribe({
            next: () => {
              // Show toast first
              this.showToast('Login successful!', 'success');

              // Delay redirect so user sees toast
              setTimeout(() => {
                this.router.navigate(['/products']);
              }, 1500);
            },
            error: () => {
              this.showToast('Login successful!', 'success');
              setTimeout(() => {
                this.router.navigate(['/products']);
              }, 1500);
            },
          });
        },
        error: () => {
          this.showToast('Invalid email or password!', 'error');
        },
      });
    }
  }

  signup() {
    if (this.loginForm.valid) {
      const userDTO: UserDTO = this.loginForm.value;

      this.authService.register(userDTO).subscribe({
        next: () => {
          this.showToast('Signed up successfully! You can login now.', 'success');
          this.isSignupMode = false;
          this.loginForm.reset({
            username: '',
            email: '',
            password: '',
            address: '',
            role: 'CUSTOMER',
          });
        },
        error: () => {
          this.showToast('Signup failed! Try again.', 'error');
        },
      });
    }
  }

  toggleMode() {
    this.isSignupMode = !this.isSignupMode;
    this.loginForm.reset({
      username: '',
      email: '',
      password: '',
      address: '',
      role: 'CUSTOMER',
    });
  }
}
