import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ivechile } from './ivechile';

@Injectable({
  providedIn: 'root',
})
export class Vechileservice {
  constructor(private http: HttpClient) {}

  getVechiles(): Observable<Ivechile[]> {
    return this.http.get<Ivechile[]>('http://localhost:3000/vechile');
  }
}
