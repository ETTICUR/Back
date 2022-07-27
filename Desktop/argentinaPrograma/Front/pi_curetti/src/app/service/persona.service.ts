import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../../app/models/models/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {
  URL = 'http://localhost:8080/personas/';

  constructor(public http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL+ 'traer/perfil');
  }
}
