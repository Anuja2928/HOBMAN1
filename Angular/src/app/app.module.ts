import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowHotelsComponent } from './show-hotels/show-hotels.component';
import { FormsModule } from '@angular/forms';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { StateDropdownComponent } from './state-dropdown/state-dropdown.component';
import { SearchHotelComponent } from './search-hotel/search-hotel.component';
import { RegisterComponent } from './register/register.component';
import { ReviewComponent } from './review/review.component';
import { CheckinComponent } from './checkin/checkin.component';
import { BookingComponent } from './booking/booking.component'
import { LoginComponent } from './login/login.component';
import { AboutusComponent } from './aboutus/aboutus.component';


@NgModule({
  declarations: [
    AppComponent,
    ShowHotelsComponent,
    UpdateHotelComponent,
    StateDropdownComponent,
    HomeComponent,
    SearchHotelComponent,
    RegisterComponent,
    ReviewComponent,
    CheckinComponent,
    BookingComponent,
    LoginComponent,
    AboutusComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
