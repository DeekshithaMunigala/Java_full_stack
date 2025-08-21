import { Component } from '@angular/core';
import { Ivechile } from '../ivechile';
import { Vechileservice } from '../vechileservice';

@Component({
  selector: 'app-vechilecomp',
  imports: [],
  templateUrl: './vechilecomp.html',
  styleUrl: './vechilecomp.css',
})
export class Vechilecomp {
  constructor(private vechileService: Vechileservice) {}

  vechiles: Ivechile[] = [];

  ngOnInit() {
    this.vechileService.getVechiles().subscribe(
      (data: Ivechile[]) => {
        this.vechiles = data;
        console.log(data);
      },
      (error) => {
        console.log('Error fetching vechile : ', error);
      }
    );
  }
}
