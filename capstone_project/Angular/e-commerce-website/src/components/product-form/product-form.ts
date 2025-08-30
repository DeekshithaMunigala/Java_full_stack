import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../../services/product-service';
import { ProductDTO } from '../../interfaces/product';

@Component({
  selector: 'app-product-form',
  imports: [ReactiveFormsModule],
  templateUrl: './product-form.html',
  styleUrl: './product-form.css',
})
export class ProductForm implements OnInit {
  productForm: FormGroup;
  isEditMode: boolean = false;
  productId?: number;
  selectedFile: File | null = null;
  imagePreview: string | ArrayBuffer | null = null;

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.productForm = this.fb.group({
      name: ['', [Validators.required]],
      description: [''],
      price: [0, [Validators.required, Validators.min(0)]],
      quantity: [0, [Validators.required, Validators.min(0)]],
    });
  }

  ngOnInit(): void {
    this.productId = this.route.snapshot.params['id'];
    this.isEditMode = !!this.productId;

    if (this.isEditMode) {
      this.loadProduct();
    }
  }

  loadProduct(): void {
    if (this.productId) {
      this.productService.getProductById(this.productId).subscribe({
        next: (product) => {
          this.productForm.patchValue({
            name: product.name,
            description: product.description,
            price: product.price,
            quantity: product.quantity,
          });
          if (product.imageUrl) {
            this.imagePreview = product.imageUrl;
          }
        },
        error: (err) => {
          console.error('Error loading product', err);
        },
      });
    }
  }

  onFileSelected(event: any): void {
    const file = event.target.files[0];
    if (file) {
      this.selectedFile = file;

      // Create preview
      const reader = new FileReader();
      reader.onload = () => {
        this.imagePreview = reader.result;
      };
      reader.readAsDataURL(file);
    }
  }

  onSubmit(): void {
    if (this.productForm.valid) {
      const productDTO: ProductDTO = {
        ...this.productForm.value,
        image: this.selectedFile,
      };

      if (this.isEditMode && this.productId) {
        this.productService.updateProduct(this.productId, productDTO).subscribe({
          next: () => {
            this.router.navigate(['/products']);
          },
          error: (err) => {
            console.error('Error updating product', err);
          },
        });
      } else {
        this.productService.createProduct(productDTO).subscribe({
          next: () => {
            this.router.navigate(['/products']);
          },
          error: (err) => {
            console.error('Error creating product', err);
          },
        });
      }
    }
  }
}
