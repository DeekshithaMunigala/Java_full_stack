import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IFruit } from '../ifruit';

@Component({
  selector: 'app-ex1displaylist',
  imports: [],
  templateUrl: './ex1displaylist.html',
  styleUrl: './ex1displaylist.css',
})
export class Ex1displaylist {
  // @Input() name: string = '';
  // @Input() img: string = '';
  // @Input() description: string = '';
  @Input() fruit: IFruit = {
    name: '',
    img: '',
    description: '',
  };

  @Output() btnOnClick = new EventEmitter<string>();

  onClick(fruitName: string) {
    // console.log('clicked');
    this.btnOnClick.emit(fruitName);
  }
}
