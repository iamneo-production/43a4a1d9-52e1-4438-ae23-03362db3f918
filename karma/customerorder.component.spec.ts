import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { CustomerorderComponent } from './customerorder.component';

describe('CustomerorderComponent', () => {
  let component: CustomerorderComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [CustomerorderComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(CustomerorderComponent);
    component = fixture.componentInstance;
  });
  it('FE_CustomerorderTest', () => {
    expect(component).toBeTruthy();
  });
});