import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BookingService } from '../booking.service';
import { Booking } from '../models/booking';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {


bookForm:FormGroup;
constructor(private fb : FormBuilder,private service:BookingService) 
 { 
  this.formBuild();
}
formBuild()
{
  this.bookForm=this.fb.group({
    
    bookingDate: this.fb.control('',Validators.required),
    checkInDate: this.fb.control('',Validators.required),
    checkOutDate: this.fb.control('',Validators.required),
    customerEmail:this.fb.control('',Validators.required),
    roomTypeId:this.fb.control('',Validators.required),
    noOfRoomsBooked:this.fb.control('',Validators.required),
  });
}

get bookingDate(){
  return this.bookForm.get('bookingDate');
}

get checkInDate(){
  return this.bookForm.get('checkInDate');
}

get checkOutDate(){
  return this.bookForm.get('checkOutDate');
}

get customerEmail(){
  return this.bookForm.get('customerEmail');
}

get roomTypeId(){
  return this.bookForm.get('roomTypeId');
}

get noOfRoomsBooked(){
  return this.bookForm.get('noOfRooms');
}


onSubmit(bookForm:FormGroup){

  console.log("onsubmit called");
  console.log('bookForm : '+bookForm);
 

  this.valueMap(bookForm);
 }

 booking:Booking =new Booking() ;

 valueMap(form : FormGroup)
 {

   this.booking.bookingDate=form.controls['bookingDate'].value;
   this.booking.checkInDate=form.controls['checkInDate'].value;
   this.booking.checkOutDate=form.controls['checkOutDate'].value;
   this.booking.customerEmail=form.controls['customerEmail'].value;
   this.booking.roomTypeId=form.controls['roomTypeId'].value;
   this.booking.noOfRoomsBooked=form.controls['noOfRoomsBooked'].value;
   
   
   this.sendBooking(this.booking);
 
 }

 

 sendBooking(booking:Booking)
 {
    this.service.booking(booking).subscribe(data => console.log("Welcome  "));

 }



 ngOnInit() {
}


}

