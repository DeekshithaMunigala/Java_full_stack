import { Routes } from '@angular/router';
import { Login } from '../login/login';
import { Product } from '../product/product';

export const routes: Routes = [
  { path: 'login', component: Login }, // give it a proper /login path
  { path: 'products', component: Product },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
];
