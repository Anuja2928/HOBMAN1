import { Customer } from './../models/register';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
//import { Customer } from '../models/register';
import { CustomerService } from '../customer.service';




@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
 
  userForm:FormGroup;
  constructor(private fb : FormBuilder,private service:CustomerService) { 
    this.formBuild();
  }
  formBuild()
  {
    this.userForm=this.fb.group({
      customerName: this.fb.control('',Validators.required),
      customerEmail: this.fb.control('',Validators.required),
      customerPhoneNumber: this.fb.control('',Validators.required),
      customerAddress:this.fb.control('',Validators.required),

  customerPassword:this.fb.control('',Validators.required),
  customerCity:this.fb.control('',Validators.required),
  customerState:this.fb.control('',Validators.required),
  customerPinCode:this.fb.control('',Validators.required),
    });
  }

  get userid(){
    return this.userForm.get('userid');
  }


  get customerName(){
    return this.userForm.get('customerName');
  }
  get customerEmail(){
    return this.userForm.get('customerEmail');
  }
  get customerPhoneNumber(){
    return this.userForm.get('customerPhoneNumber');
  }
  get customerAddress(){
    return this.userForm.get('customerAddress');
  }
  get customerPassword(){
    return this.userForm.get('customerPassword');
  }
  get customerCity(){
    return this.userForm.get('customerCity');
  }
  get customerState(){
    return this.userForm.get('customerState');
  }

  get customerPinCode(){
    return this.userForm.get('customerPincode');
  }


  onSubmit(userForm:FormGroup){

    console.log("onsubmit called");
   

    this.valueMap(userForm);
   }

   customer:Customer =new Customer() ;

   valueMap(form : FormGroup)
   {
 
     this.customer.customerName=form.controls['customerName'].value;
     this.customer.customerPhoneNumber=form.controls['customerPhoneNumber'].value;
     this.customer.customerEmail=form.controls['customerEmail'].value;
     this.customer.customerAddress=form.controls['customerAddress'].value;

     this.customer.customerPassword=form.controls['customerPassword'].value;
     this.customer.customerCity=form.controls['customerCity'].value;

     this.customer.customerState=form.controls['customerState'].value;
     this.customer.customerPinCode=form.controls['customerPinCode'].value;

     
    this.sendCustomer(this.customer);
   
   }


   sendCustomer(customer:Customer)
   {
      this.service.register(customer).subscribe(data => console.log("Welcome "));

   }



  ngOnInit() {
  }

}
