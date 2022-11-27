import { Injectable } from '@angular/core';
import { Service } from '../model/service.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  services : Service[]; // tableau de chaines de caractères de Service

  constructor() { 
    console.log("Création de service !");
    this.services =[
      { id_service : 1, date_creation : new Date("01/01/2010"), nom_service : "Bricolage", prix_service : 30.000},
      { id_service : 2, date_creation : new Date("10/09/2013"), nom_service : "Jardinage", prix_service : 40.000},
      { id_service : 3, date_creation : new Date("11/04/2011"), nom_service : "Informatique", prix_service : 50.000}
     ];
  }

  listeServices() : Service[] {
    return this.services;
  }

  ajouterService(service : Service){
    this.services.push(service);

  }
}
