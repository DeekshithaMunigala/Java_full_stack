import { Routes } from '@angular/router';
import { Login } from '../login/login';
import { ProductList } from '../product-list/product-list';
import { Cart } from '../cart/cart';
import { ProductForm } from '../product-form/product-form';

export const routes: Routes = [
  { path: 'login', component: Login },
  { path: 'products', component: ProductList },
  { path: 'cart', component: Cart },
  { path: 'admin/add-product', component: ProductForm },
  { path: 'admin/edit-product/:id', component: ProductForm },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
];
