import { Injectable } from '@angular/core';
import { Customer } from './models/register';
import { City } from './models/city';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {


  url='http://localhost:8080/CustomerApi/customers.do';
  constructor(private _http: HttpClient) { }

  register(customer: Customer):Observable<Object>
    {
        console.log("Data send to url");
       return this._http.post(this.url,customer);
    }
    
    getcitydata():Observable<City[]>
    {
      return this._http.get<City[]>(this.url)
    }
}




