import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CardCorrection } from './card-correction';


@Injectable({
  providedIn:'root'
})
export class NgserviceService {

  constructor(private _http:HttpClient) { }

  // fetchValuesFromRemote():Observable<any>{
  //   return this._http.get("http://localhost:8080/getValues");
  // }

  addDetailsToRemote(cardcorrection:CardCorrection):Observable<any>{
    return this._http.post<any>("http://localhost:8080/addValues",cardcorrection);
  }

  // fetchValuesFromRemoteById(id:number):Observable<any>{
  //   return this._http.get("http://localhost:8080/getValuesbyid/"+id);
  // }
  
}
