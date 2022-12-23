import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentRegdComponent } from './student-regd.component';

describe('StudentRegdComponent', () => {
  let component: StudentRegdComponent;
  let fixture: ComponentFixture<StudentRegdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentRegdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentRegdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
