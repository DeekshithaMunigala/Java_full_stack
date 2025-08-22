import { Component, OnInit } from '@angular/core';
import { Productservice } from '../productservice';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css',
})
export class Productedit implements OnInit {
  constructor(
    private activatedRoute: ActivatedRoute,
    private productService: Productservice,
    private router: Router
  ) {}

  id: string | null = null;
  product: Product = {
    name: '',
    category: '',
    price: 0,
    qty: 0,
  };

  ngOnInit() {
    this.id = this.activatedRoute.snapshot.paramMap.get('id');

    if (this.id) {
      this.productService.findProduct(this.id).subscribe((product) => {
        this.product = product;
      });
    }
  }

  save() {
    this.productService.saveProduct(this.product).subscribe({
      next: (product) => {
        this.router.navigate(['/productlist']);
      },
      error: (error) => {
        console.error('Error saving the product : ', error);
      },
    });
  }

  // save() {
  // // make sure id is set
  // if (!this.product.id && this.id) this.product.id = Number(this.id);
  // this.productService.saveProduct(this.product).subscribe({
  //   next: () => this.router.navigate(['/productlist']),
  //   error: (e) => console.error('Error saving the product : ', e),
  // });
  // }
}
