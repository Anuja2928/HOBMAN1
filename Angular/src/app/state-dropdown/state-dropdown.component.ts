import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {State, City , Hotel} from '../state'
import { StateDropdownService } from '../state-dropdown.service';

@Component({
  selector: 'app-state-dropdown',
  templateUrl: './state-dropdown.component.html',
  styleUrls: ['./state-dropdown.component.css']
})
export class StateDropdownComponent implements OnInit {
private states:Observable<State[]>;
private cities:Observable<City[]>;
private hotels:Observable<Hotel[]>

constructor(private service:StateDropdownService) { }

stateId:number;
cityId:number;

  ngOnInit() {
    console.log("inside ngOnInit Method");
    this.getState();
  }

  getState()
  {
    this.service.getS().subscribe((data)=>{ this.states=data;
    console.log(data);
  
  });
  }

  onChangeState(event)
  {

      this.stateId=event.target.value;
      console.log(this.stateId);
      this.service.getSelectedState(this.stateId).subscribe((data)=>{ this.cities=data;
        console.log(data);
      
      });;
  }
 
 
  onChangeCity(event){
    console.log('in onChangeCity(event) with value : '+ event.target.value);
    this.cityId = event.target.value;
    alert(this.cityId);
    this.service.getSelectedHotel(this.cityId).subscribe((data)=>{ this.hotels=data;
      
      alert(this.cityId);

      //debugger;
     console.log(data);
  });
  }


  getHotelByCity()
  {
   
}


}
