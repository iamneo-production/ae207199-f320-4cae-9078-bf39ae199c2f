
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgserviceService } from 'src/app/ngservice.service';
import { CardCorrection } from 'src/app/card-correction';


@Component({
  selector: 'app-cardcorrection',
  templateUrl: './cardcorrection.component.html',
  styleUrls: ['./cardcorrection.component.css']
})
export class CardcorrectionComponent implements OnInit {
screen =1;

cardcorrection =new CardCorrection();
  constructor(private _route:Router,private _service:NgserviceService) { }

  ngOnInit() {
            // this._service.fetchValuesFromRemote().subscribe(
            //   data=>console.log("response recevied"),
            //   error=>console.log("error occured")

            // )
  }
  // adddetailsformsubmit(){
  //   this._service.addDetailsToRemote(this.cardcorrection).subscribe(
  //     data=>{
  //         console.log("form submitted successfully");
  //         this._route.navigate(['cardcorrection']);
  //      },
  //      error=>console.log("error")
  //   )
  // }
  formsubmit(){
    this._service.addDetailsToRemote(this.cardcorrection).subscribe(
      data=>{
          console.log("form submitted successfully");
          this._route.navigate(['./display']);
       },
       error=>console.log("error")
    )

  }
  // gotoEditPage(id:number){
  //   console.log("id"+id);
  //   this._route.navigate(['./edit-cardcorrection',id]);
  // }
  // gotoEditPage(){
  //   // console.log("id"+id);
  //   this._route.navigate(['./edit-cardcorrection']);
  // }


  }


