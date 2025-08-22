import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root',
})
export class Productservice {
  constructor(private http: HttpClient) {}

  getProducts(): Observable<Product[]> {
    const url: string = `http://localhost:3000/products`;
    return this.http.get<Product[]>(url);
  }

  addProduct(product: Product): Observable<Product> {
    const url: string = `http://localhost:3000/products`;
    return this.http.post<Product>(url, product);
  }

  deleteProduct(id: string | number): Observable<void> {
    const url: string = `http://localhost:3000/products/${id}`;
    return this.http.delete<void>(url);
  }

  findProduct(id: string | number): Observable<Product> {
    const url: string = `http://localhost:3000/products/${id}`;
    return this.http.get<Product>(url);
  }

  saveProduct(product: Product): Observable<Product> {
    const url: string = `http://localhost:3000/products/${product.id}`;
    return this.http.put<Product>(url, product);
  }
}
