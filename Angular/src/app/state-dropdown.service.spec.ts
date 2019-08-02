import { TestBed } from '@angular/core/testing';

import { StateDropdownService } from './state-dropdown.service';

describe('StateDropdownService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StateDropdownService = TestBed.get(StateDropdownService);
    expect(service).toBeTruthy();
  });
});
