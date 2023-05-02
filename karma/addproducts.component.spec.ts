import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AddproductsComponent } from './addproducts.component';

describe('AddproductsComponent', () => {
  let component: AddproductsComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AddproductsComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AddproductsComponent);
    component = fixture.componentInstance;
  });
  it('FE_AdminAddproductsTest', () => {
    expect(component).toBeTruthy();
  });
});