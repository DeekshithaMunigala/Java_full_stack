import { Component } from '@angular/core';
import { Ivechile } from '../ivechile';
import { Vechileservice } from '../vechileservice';
import { ChangeDetectorRef } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-vechilecomp',
  imports: [],
  templateUrl: './vechilecomp.html',
  styleUrl: './vechilecomp.css',
})
export class Vechilecomp {
  constructor(private vechileService: Vechileservice, private cdr: ChangeDetectorRef) {}

  vechiles: Ivechile[] = [];

  vechileEdit: Ivechile = {
    id: '',
    make: '',
    model: '',
    fuelType: '',
    price: 0,
  };
  vechileAdd: Ivechile = {
    id: '',
    make: '',
    model: '',
    fuelType: '',
    price: 0,
  };

  ngOnInit() {
    this.vechileService.getVechiles().subscribe(
      (data: Ivechile[]) => {
        this.vechiles = data;
        this.cdr.detectChanges();
        console.log(data);
      },
      (error) => {
        console.error('Error fetching vechile : ', error);
      }
    );
  }

  edit(vechileId: string) {
    console.log(vechileId);
    this.vechileService.getVechileById(vechileId).subscribe(
      (vechile: Ivechile) => {
        console.log('user details', vechile);
        this.vechileEdit = vechile;
        console.log('user details after editing', vechile);
        this.cdr.detectChanges();
      },
      (error) => {
        console.error('Error fectching user by ID: ', error);
      }
    );
  }

  delete(vechileId: string) {}
}
