import { Component } from '@angular/core';
import { Ex8taskList } from '../ex8task-list/ex8task-list';
import { ITask } from '../itask';
import { NewTask } from '../new-task';

@Component({
  selector: 'app-home',
  imports: [Ex8taskList],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  tasks: ITask[] = [];
  uniqueId: number = 1;

  addTask(task: NewTask) {
    const newTask: ITask = {
      id: this.uniqueId++,
      ...task,
    };

    this.tasks.push(newTask);
  }

  deleteTask(id: number) {
    this.tasks = this.tasks.filter((task) => task.id !== id);
  }
}
