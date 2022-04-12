import { TestBed } from '@angular/core/testing';

import { ApplynewcardService } from './applynewcard.service';

describe('ApplynewcardService', () => {
  let service: ApplynewcardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApplynewcardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
