import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplynewcardComponent } from './applynewcard.component';

describe('ApplynewcardComponent', () => {
  let component: ApplynewcardComponent;
  let fixture: ComponentFixture<ApplynewcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApplynewcardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplynewcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
