import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StateDropdownService {
// private url1 = "http://localhost:8080/HobmanServices/states/";
private url1 = "http://localhost:49823/Service1.svc/states";

// private url2 = "http://localhost:8080/HobmanServices/cities/";
private url2 = "http://localhost:49823/Service1.svc//cityByStates/";


// private url3 = "http://localhost:8080/HobmanServices/hotelsbycity/"
private url3 = "http://localhost:49823/Service1.svc/hotels/"

// http://localhost:8080/HobmanServices/cities/1.do

  constructor(private http:HttpClient) { }

  getS():Observable<any>{
    console.log("inside service method");
    return this.http.get(this.url1);
  }

  getSelectedState(stateId:number):Observable<any>{
 console.log("inside  getSelectedState method");
 return this.http.get(this.url2+stateId);
  }

  getSelectedHotel(cityId:number):Observable<any>{
    console.log("----------------inside getSelectedHotel");
    return this.http.get(this.url3+cityId);
  }
}
