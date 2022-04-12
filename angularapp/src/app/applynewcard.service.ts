import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { NewCard } from './new-card';

@Injectable({
  providedIn: 'root'
})
export class ApplynewcardService {

  constructor(private _http:HttpClient) {

  }
  fetchValuesFromRemote(newcard:NewCard):any{
   return this._http.get("https://8080-fbfacdbfeeafbbbcbaebfcfdbcedfe.examlyiopb.examly.io/getValues");
 }
 addDetailsToRemote(newcard:NewCard):any{
   return this._http.post<any>("https://8080-fbfacdbfeeafbbbcbaebfcfdbcedfe.examlyiopb.examly.io/addValues",newcard);
 }
}
