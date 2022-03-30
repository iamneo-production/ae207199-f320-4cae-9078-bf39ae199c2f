import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { NewCard } from './new-card';

@Injectable({
  providedIn: 'root'
})
export class ApplynewcardService {

  constructor(private _http:HttpClient) {

  }
  fetchValuesFromRemote():Observable<any>{
   return this._http.get("http://localhost:8080/getValues");
 }
 addDetailsToRemote(newcard:NewCard):Observable<any>{
   return this._http.post<any>("http://localhost:8080/addValues",newcard);
 }
}
