import { Component, OnInit } from '@angular/core';
import { CommonModule, DatePipe } from '@angular/common';
import { Productservice } from '../productservice';
import { OrderResponse } from '../order';

@Component({
  selector: 'app-orderhistorycomp',
  imports: [DatePipe, CommonModule],
  templateUrl: './orderhistorycomp.html',
  styleUrl: './orderhistorycomp.css',
})
export class Orderhistorycomp implements OnInit {
  orders: OrderResponse[] = [];
  constructor(private productService: Productservice) {}

  ngOnInit() {
    this.productService.getOrders().subscribe({
      next: (os) => (this.orders = os),
      error: () => alert('Failed to load orders'),
    });
  }
}
