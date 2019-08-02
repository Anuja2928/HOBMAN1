import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowHotelsComponent } from './show-hotels/show-hotels.component';
import { StateDropdownComponent } from './state-dropdown/state-dropdown.component';
import { RegisterComponent } from './register/register.component';
import { CheckinComponent } from './checkin/checkin.component';
import { HomeComponent } from './home/home.component';
import { BookingComponent } from './booking/booking.component';
import { LoginComponent } from './login/login.component';
import { AboutusComponent } from './aboutus/aboutus.component';


const routes: Routes = [{path:'hotels', component : ShowHotelsComponent}, 
                        {path : 'byRegion', component : StateDropdownComponent},
                        {path : 'customerSignUp', component : RegisterComponent },
                        {path :'checkin', component : CheckinComponent},
                         {path: 'home' , component : HomeComponent},
                        {path:'home/bookHotel', component : BookingComponent},
                      {path:'customerlogin', component : LoginComponent},
                      {path:'aboutus', component : AboutusComponent}];

//const routes: Routes = [{path:'players',component:ShowPlayersComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
