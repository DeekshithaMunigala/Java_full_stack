import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NewTask } from '../new-task';

@Component({
  selector: 'app-ex8task-list',
  imports: [FormsModule],
  templateUrl: './ex8task-list.html',
  styleUrl: './ex8task-list.css',
})
export class Ex8taskList {
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
