import { Component, OnInit } from '@angular/core';
import { CartService } from '../../services/cart-service';
import { CartItem } from '../../interfaces/product';

@Component({
  selector: 'app-cart',
  imports: [],
  templateUrl: './cart.html',
  styleUrl: './cart.css',
})
export class Cart implements OnInit {
  cartItems: CartItem[] = [];

  constructor(private cartService: CartService) {}

  ngOnInit(): void {
    this.cartService.cart$.subscribe((items) => {
      this.cartItems = items;
    });
  }

  updateQuantity(item: CartItem, quantity: number): void {
    if (quantity <= 0) {
      this.removeFromCart(item.product?.id!);
    } else {
      this.cartService.updateQuantity(item.product?.id!, quantity);
    }
  }

  removeFromCart(productId: number): void {
    this.cartService.removeFromCart(productId);
  }

  getTotal(): number {
    return this.cartService.getTotal();
  }

  checkout(): void {
    alert('Checkout functionality would be implemented here!');
    this.cartService.clearCart();
  }
}
