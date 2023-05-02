import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { CustomercartComponent } from './customercart.component';

describe('CustomercartComponent', () => {
  let component: CustomercartComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [CustomercartComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(CustomercartComponent);
    component = fixture.componentInstance;
  });
  it('FE_CustomercartTest', () => {
    expect(component).toBeTruthy();
  });
});