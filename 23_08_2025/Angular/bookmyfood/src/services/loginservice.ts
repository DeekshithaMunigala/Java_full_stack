import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Ilogin } from '../interfaces/ilogin';
import { Observable } from 'rxjs';
import { Token } from '../interfaces/token';
import { Isignup } from '../interfaces/isignup';

@Injectable({
  providedIn: 'root',
})
export class Loginservice {
  constructor(private http: HttpClient) {}

  login(req: Ilogin): Observable<Token> {
    const BASE_URL = 'http://localhost:9191/user/login';
    return this.http.post<Token>(BASE_URL, req);
  }

  saveToken(token: string) {
    localStorage.setItem('jwtToken', token);
  }

  getToken(): string | null {
    return localStorage.getItem('jwtToken');
  }

  logout() {
    localStorage.removeItem('jwtToken');
  }

  signup(req: Isignup): Observable<any> {
    const BASE_URL = 'http://localhost:9191/user';
    return this.http.post(BASE_URL, req);
  }
}
