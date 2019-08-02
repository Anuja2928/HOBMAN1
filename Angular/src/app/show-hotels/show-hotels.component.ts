import { Component, OnInit, Input } from '@angular/core';
import { Hotel } from '../state';

import { Observable } from 'rxjs';
import { bloomAdd } from '@angular/core/src/render3/di';
import { all } from 'q';
import { HotelServiceService } from '../hotel-service.service';


@Component({
  selector: 'app-show-hotels',
  templateUrl: './show-hotels.component.html',
  styleUrls: ['./show-hotels.component.css']
})
export class ShowHotelsComponent implements OnInit {

  @Input() hotel : Hotel;
  newHotel :Hotel = new Hotel();
  constructor(private service : HotelServiceService) { }

  private hotels : Observable<Hotel[]>;
  ngOnInit() {
  }

  callGetHotelsList()
  {
    console.log('in callGetHotelList() of showHotels component.ts');
    this.hotels = this.service.getHotelList();
  }

  callAddHotel()
  {
    console.log('onSubmit called');
    this.service.addHotel(this.newHotel).subscribe(data=> console.log('Hiii'));
    this.newHotel = new Hotel();
  }

}
