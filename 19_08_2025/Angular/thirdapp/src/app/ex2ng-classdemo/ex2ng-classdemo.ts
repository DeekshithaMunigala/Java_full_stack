import { Component } from '@angular/core';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-ex2ng-classdemo',
  imports: [NgClass],
  templateUrl: './ex2ng-classdemo.html',
  styleUrl: './ex2ng-classdemo.css',
})
export class Ex2ngClassdemo {
  flag1: boolean = true;
  flag2: boolean = true;
}
