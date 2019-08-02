import { CustomerLoginService } from './../customer-login.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

import { Customer } from '../models/register';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})




export class LoginComponent implements OnInit {

    userForm1:FormGroup;

  constructor(private fb1 : FormBuilder,private service:CustomerLoginService,private route:Router) { 
    this.formBuild1();
  }
  formBuild1()
  {
    this.userForm1=this.fb1.group({
      
      customerEmail: this.fb1.control('',Validators.required),

  customerPassword:this.fb1.control('',Validators.required),

    });
  }

  
  get customerEmail(){
    return this.userForm1.get('customerEmail');
  }
  get customerPassword(){
    return this.userForm1.get('customerPassword');
  }

  onSubmit(userForm1:FormGroup){

    console.log("onsubmit called");
   

    this.valueMap(userForm1);
   }

   customer:Customer =new Customer() ;

   valueMap(form1 : FormGroup)
   {
 
     this.customer.customerEmail=form1.controls['customerEmail'].value;
  

     this.customer.customerPassword=form1.controls['customerPassword'].value;
 

     
    this.sendCustomer(this.customer);
   
   }

   message:string;
   sendCustomer(customer:Customer)
   {
      this.service.CustomerLoginService(customer).subscribe((data) => {this.message=data.toString()});
      localStorage.setItem('msg',this.message);
      if(this.message == 'Successfully Logged In')
        this.route.navigate(['/home']);
        
   }






  ngOnInit() {
  }

}
