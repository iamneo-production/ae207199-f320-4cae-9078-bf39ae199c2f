import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApplynewcardService } from '../applynewcard.service';
import { NewCard } from '../new-card';

@Component({
  selector: 'app-applynewcard',
  templateUrl: './applynewcard.component.html',
  styleUrls: ['./applynewcard.component.css']
})
export class ApplynewcardComponent implements OnInit {
  newcard=new NewCard();

  screen = 1;
  constructor(private _route:Router,private _service:ApplynewcardService) { }

  ngOnInit() {
    this._service.fetchValuesFromRemote().subscribe(
      data=>console.log("response recevied"),
      error=>console.log("error occured")

    )
}
formsubmit(){
  this._service.addDetailsToRemote(this.newcard).subscribe(
    data=>{
        console.log("form submitted successfully");
        
     },
     error=>console.log("error")
  )

}



}
