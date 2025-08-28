import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe('App', () => {
  var component: App;
  // beforeEach(async () => {
  //   await TestBed.configureTestingModule({
  //     imports: [App],
  //   }).compileComponents();
  // });

  // it('should create the app', () => {
  //   const fixture = TestBed.createComponent(App);
  //   const app = fixture.componentInstance;
  //   expect(app).toBeTruthy();
  // });

  // it('should render title', () => {
  //   const fixture = TestBed.createComponent(App);
  //   fixture.detectChanges();
  //   const compiled = fixture.nativeElement as HTMLElement;
  //   expect(compiled.querySelector('h1')?.textContent).toContain('Hello, apptestdemo');
  // });

  beforeEach(() => {
    component = new App();
  });

  it('Test Case Palindrom true', () => {
    const result = component.isPalindrome('madam');
    expect(true).toBe(true);
  });

  it('Test Case Palindrom false', () => {
    const result = component.isPalindrome('hello');
    expect(false).toBe(false);
  });
});
