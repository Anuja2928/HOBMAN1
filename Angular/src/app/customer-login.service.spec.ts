import { TestBed } from '@angular/core/testing';

import { CustomerLoginService } from './customer-login.service';

describe('CustomerLoginService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustomerLoginService = TestBed.get(CustomerLoginService);
    expect(service).toBeTruthy();
  });
});
