import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdmincartComponent } from './admincart.component';

describe('AdmincartComponent', () => {
  let component: AdmincartComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AdmincartComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdmincartComponent);
    component = fixture.componentInstance;
  });
  it('FE_AdminorderTest', () => {
    expect(component).toBeTruthy();
  });
});