import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardcorrectionComponent } from './cardcorrection.component';

describe('CardcorrectionComponent', () => {
  let component: CardcorrectionComponent;
  let fixture: ComponentFixture<CardcorrectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardcorrectionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CardcorrectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
