import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable, tap } from 'rxjs';
import { User, UserDTO } from '../interfaces/user';
import { Token } from '../interfaces/token';
import { Router } from '@angular/router';
import { jwtDecode } from 'jwt-decode';
import { throwError, of } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private apiUrl = 'http://localhost:9191/user';
  private tokenKey = 'jwtToken';
  private currentUserSubject = new BehaviorSubject<User | null>(null);
  public currentUser$ = this.currentUserSubject.asObservable();

  constructor(private http: HttpClient, private router: Router) {
    const token = this.getToken();
    if (token) {
      // Try to get user info if token exists
      this.getCurrentUser().subscribe();
    }
  }

  login(userDTO: UserDTO): Observable<Token> {
    return this.http.post<Token>(`${this.apiUrl}/login`, userDTO).pipe(
      tap((response) => {
        this.storeToken(response.token);
        this.getCurrentUser().subscribe();
      })
    );
  }

  register(userDTO: UserDTO): Observable<User> {
    return this.http.post<User>(`${this.apiUrl}/register`, userDTO);
  }

  logout(): void {
    localStorage.removeItem(this.tokenKey);
    this.currentUserSubject.next(null);
    this.router.navigate(['/login']);
  }

  storeToken(token: string): void {
    localStorage.setItem(this.tokenKey, token);
  }

  getToken(): string | null {
    return localStorage.getItem(this.tokenKey);
  }

  isLoggedIn(): boolean {
    return !!this.getToken();
  }

  isAdmin(): boolean {
    const user = this.currentUserSubject.value;
    return user ? user.role === 'ADMIN' : false;
  }

  getCurrentUser(): Observable<User> {
    const token = this.getToken();
    if (token) {
      try {
        const decoded: any = jwtDecode(token);
        // Assuming your JWT contains username in the payload
        const user: User = {
          username: decoded.sub || decoded.username, // Adjust based on your JWT structure
          email: decoded.email,
          role: decoded.role || 'CUSTOMER',
          password: '', // You won't get password from JWT
        };
        this.currentUserSubject.next(user);
        return of(user);
      } catch (error) {
        return throwError(() => new Error('Invalid token'));
      }
    }
    return throwError(() => new Error('No token found'));
  }
}
