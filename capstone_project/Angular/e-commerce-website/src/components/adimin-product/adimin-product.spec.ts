import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdiminProduct } from './adimin-product';

describe('AdiminProduct', () => {
  let component: AdiminProduct;
  let fixture: ComponentFixture<AdiminProduct>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdiminProduct]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdiminProduct);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
