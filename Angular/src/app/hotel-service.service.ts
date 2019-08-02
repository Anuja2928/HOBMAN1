import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { Hotel } from './state';
@Injectable({
  providedIn: 'root'
})
export class HotelServiceService {

  private baseURL ='http://localhost:8080/HotelApi/hotels.do'
  
  constructor(private http : HttpClient) { }

  getHotelList(): Observable<any>
  {
    console.log('in getHotelList')
    return this.http.get(this.baseURL);
  }

  addHotel(hotel :Hotel): Observable<Object>
  {
    console.log('about to add a hotel');
    return this.http.post(this.baseURL,hotel);
  }
}
