import { Booking } from './models/booking';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  
  url='http://localhost:8080/BookingService/bookings';
  constructor(private _http: HttpClient) { }

  booking(booking: Booking):Observable<Object>
    {
        console.log("Data send to url");
       return this._http.post(this.url,booking);
    }
    
  
}