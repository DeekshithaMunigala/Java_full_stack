import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product, ProductDTO } from '../interfaces/product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private apiUrl = 'http://localhost:9191/product';

  constructor(private http: HttpClient) {}

  getAllProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.apiUrl);
  }

  getProductById(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.apiUrl}/${id}`);
  }

  createProduct(productDTO: ProductDTO): Observable<Product> {
    const formData = new FormData();
    formData.append('name', productDTO.name);
    formData.append('description', productDTO.description);
    formData.append('price', productDTO.price.toString());
    formData.append('quantity', productDTO.quantity.toString());
    if (productDTO.image) {
      formData.append('image', productDTO.image);
    }

    return this.http.post<Product>(this.apiUrl, formData);
  }

  updateProduct(id: number, productDTO: ProductDTO): Observable<Product> {
    const formData = new FormData();
    formData.append('name', productDTO.name);
    formData.append('description', productDTO.description);
    formData.append('price', productDTO.price.toString());
    formData.append('quantity', productDTO.quantity.toString());
    if (productDTO.image) {
      formData.append('image', productDTO.image);
    }

    return this.http.put<Product>(`${this.apiUrl}/${id}`, formData);
  }

  deleteProduct(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
