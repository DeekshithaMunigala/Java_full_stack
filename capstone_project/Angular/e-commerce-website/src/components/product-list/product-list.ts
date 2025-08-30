import { Component, OnInit } from '@angular/core';
import { Product } from '../../interfaces/product';
import { ProductService } from '../../services/product-service';
import { AuthService } from '../../services/auth-service';
import { CartService } from '../../services/cart-service';
import { FormsModule } from '@angular/forms';
import { CurrencyPipe } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-product-list',
  imports: [FormsModule, CurrencyPipe, RouterModule],
  templateUrl: './product-list.html',
  styleUrl: './product-list.css',
})
export class ProductList implements OnInit {
  products: Product[] = [];
  filteredProducts: Product[] = [];
  isAdmin: boolean = false;
  searchTerm: string = '';

  constructor(
    private productService: ProductService,
    private authService: AuthService,
    private cartService: CartService
  ) {}

  ngOnInit(): void {
    this.isAdmin = this.authService.isAdmin();
    this.loadProducts();
  }

  loadProducts(): void {
    this.productService.getAllProducts().subscribe({
      next: (products) => {
        this.products = products;
        this.filteredProducts = products;
      },
      error: (err) => {
        console.error('Error loading products', err);
      },
    });
  }

  filterProducts(): void {
    const term = this.searchTerm.toLowerCase();
    this.filteredProducts = this.products.filter(
      (p) =>
        p.name.toLowerCase().includes(term) ||
        (p.description && p.description.toLowerCase().includes(term))
    );
  }

  addToCart(product: Product): void {
    this.cartService.addToCart(product);
  }

  deleteProduct(productId: number): void {
    this.productService.deleteProduct(productId).subscribe({
      next: () => this.loadProducts(),
      error: (err) => console.error('Error deleting product', err),
    });
  }

  // Optional trackBy for performance
  trackById(index: number, product: Product): number {
    return product.id!;
  }
}
