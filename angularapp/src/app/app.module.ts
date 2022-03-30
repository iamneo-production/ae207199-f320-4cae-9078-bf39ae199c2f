import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardcorrectionComponent }  from './cardcorrection/cardcorrection.component'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialExampleModule } from 'src/material.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NgserviceService } from './ngservice.service';



@NgModule({
  declarations: [
    AppComponent,
    CardcorrectionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialExampleModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [NgserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
