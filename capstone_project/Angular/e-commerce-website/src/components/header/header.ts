import { Component } from '@angular/core';
import { AuthService } from '../../services/auth-service';
import { User } from '../../interfaces/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  imports: [CommonModule],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {
  currentUser: User | null = null;
  isAdmin: boolean = false;
  showDropdown: boolean = false;

  constructor(public authService: AuthService) {}

  ngOnInit(): void {
    this.authService.currentUser$.subscribe((user) => {
      this.currentUser = user;
      this.isAdmin = this.authService.isAdmin();
    });
  }

  toggleDropdown(): void {
    this.showDropdown = !this.showDropdown;
  }

  logout(): void {
    this.authService.logout();
    this.showDropdown = false;
  }
}
