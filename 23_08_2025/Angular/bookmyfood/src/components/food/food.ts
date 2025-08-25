import { Component } from '@angular/core';
import { Foodservice } from '../../services/foodservice';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-food',
  imports: [CommonModule],
  templateUrl: './food.html',
  styleUrl: './food.css',
})
export class Food {
  foods: Food[] = [];

  name: string = '';
  img: string = '';
  category: string = '';
  price: number = 0;

  constructor(private foodService: Foodservice) {}

  ngOnInit(): void {
    this.foodService.getAllFoods().subscribe({
      next: (data) => {
        (this.foods = data), console.log(this.foods);
      },

      error: () => alert('Unauthorized or token expired!'),
    });
  }
}
