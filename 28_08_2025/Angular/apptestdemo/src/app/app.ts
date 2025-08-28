import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('apptestdemo');

  isPalindrome(str: string) {
    const originalString = str.toLowerCase();
    const reversedString = originalString.split('').reverse().join('');
    return originalString === reversedString;
  }
}
