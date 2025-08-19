import { Component, Input } from '@angular/core';
import { ITask } from '../itask';

@Component({
  selector: 'app-ex8task-list',
  imports: [],
  templateUrl: './ex8task-list.html',
  styleUrl: './ex8task-list.css',
})
export class Ex8taskList {
  @Input() tasks: ITask[] = [];

  deleteTask(id: number) {
    this.tasks = this.tasks.filter((task) => task.id !== id);
  }
}
