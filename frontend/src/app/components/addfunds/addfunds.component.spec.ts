import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddfundsComponent } from './addfunds.component';

describe('AddfundsComponent', () => {
  let component: AddfundsComponent;
  let fixture: ComponentFixture<AddfundsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddfundsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddfundsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
