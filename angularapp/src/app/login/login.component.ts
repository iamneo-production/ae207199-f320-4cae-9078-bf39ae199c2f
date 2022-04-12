import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit 
{

  user:User =new User('','');

 
//---------------------------------
  form = new FormGroup({
    
    username: new FormControl('', [
      Validators.required,
      Validators.email
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6)
      
    ])
    
   });
    constructor() { }
    
  
    get username(){
      return this.form.get('username')
    }
     onSubmit(){
      alert(JSON.stringify(this.form.value));
    }
   
    ngOnInit() {
    }
 

   
}
