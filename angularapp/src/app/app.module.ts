import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApplynewcardComponent } from './applynewcard/applynewcard.component';
import { MaterialExampleModule } from 'src/material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ApplynewcardService } from './applynewcard.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    ApplynewcardComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialExampleModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [ApplynewcardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
