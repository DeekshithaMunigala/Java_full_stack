import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex1home } from './app/ex1home/ex1home';

bootstrapApplication(Ex1home, appConfig).catch((err) => console.error(err));
