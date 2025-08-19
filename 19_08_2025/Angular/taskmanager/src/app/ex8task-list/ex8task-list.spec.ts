import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8taskList } from './ex8task-list';

describe('Ex8taskList', () => {
  let component: Ex8taskList;
  let fixture: ComponentFixture<Ex8taskList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8taskList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8taskList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
