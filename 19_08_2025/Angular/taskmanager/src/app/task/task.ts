import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NewTask } from '../new-task';

@Component({
  selector: 'app-task',
  imports: [FormsModule],
  templateUrl: './task.html',
  styleUrl: './task.css',
})
export class Task {
  description = '';
  category = '';

  @Output() taskAdded = new EventEmitter<NewTask>();

  addTask() {
    if (this.description && this.category) {
      const newTask: NewTask = {
        description: this.description,
        category: this.category,
      };

      this.taskAdded.emit(newTask);

      this.description = '';
      this.category = '';
    }
  }
}
