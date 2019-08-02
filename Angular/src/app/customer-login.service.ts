//import { CustomerLoginService } from './customer-login.service';

import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from './models/register';





@Injectable({
  providedIn: 'root'
})
export class CustomerLoginService {

  private baseurl = 'http://localhost:8080/HobmanServices/customer/authentication';
  
  constructor(private _http:HttpClient) {}
  
  CustomerLoginService(customer: Customer):Observable<Object>
  {
      console.log("Data send to baseurl");
     return this._http.post(this.baseurl,customer);
  }

  


}
