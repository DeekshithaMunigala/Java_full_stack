import { Component } from '@angular/core';
import { Ex8taskList } from '../ex8task-list/ex8task-list';
import { ITask } from '../itask';
import { NewTask } from '../new-task';
import { Task } from '../task/task';

@Component({
  selector: 'app-home',
  imports: [Ex8taskList, Task],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  tasks: ITask[] = [];
  uniqueId = 1;

  addTask(task: NewTask) {
    const newTask: ITask = {
      id: this.uniqueId++,
      ...task,
    };
    this.tasks.push(newTask);
  }

  deleteTask(id?: number) {
    if (id !== undefined) {
      this.tasks = this.tasks.filter((task) => task.id !== id);
    }
  }
}
