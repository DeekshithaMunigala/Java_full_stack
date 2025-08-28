import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Loginservice } from '../../services/loginservice';
import { Ilogin } from '../../interfaces/ilogin';
import { Isignup } from '../../interfaces/isignup';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './login.html',
  styleUrls: ['./login.css'], // ✅ corrected
})
export class Login {
  email: string = '';
  password: string = '';
  username: string = '';

  isSignupMode: boolean = false;

  // ✅ Toast state
  toastMessage: string | null = null;
  toastType: 'success' | 'error' = 'success';

  constructor(private loginService: Loginservice, private router: Router) {}

  // ✅ Toast functions
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
    const loginReq: Ilogin = {
      email: this.email,
      passWord: this.password,
    };

    this.loginService.login(loginReq).subscribe({
      next: (res) => {
        this.loginService.saveToken(res.token);

        // ✅ show toast first
        this.showToast('Login successful!', 'success');

        // ✅ delay redirect so user sees toast
        setTimeout(() => {
          this.router.navigate(['/food']);
        }, 1500);
      },
      error: () => {
        this.showToast('Invalid email or password!', 'error');
      },
    });
  }

  signup() {
    const signupReq: Isignup = {
      name: this.username,
      email: this.email,
      passWord: this.password,
    };

    this.loginService.signup(signupReq).subscribe({
      next: () => {
        this.showToast('Signed up successfully! You can login now.', 'success');
        this.isSignupMode = false;
        this.username = '';
        this.email = '';
        this.password = '';
      },
      error: () => {
        this.showToast('Signup failed! Try again.', 'error');
      },
    });
  }

  toggleMode() {
    this.isSignupMode = !this.isSignupMode;
    this.username = '';
    this.email = '';
    this.password = '';
  }
}
