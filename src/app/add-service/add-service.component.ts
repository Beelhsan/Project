import { ServiceService } from './../Servs/service.service';
import { Component, OnInit } from '@angular/core';
import { Service } from '../model/service.model';

@Component({
  selector: 'app-add-service',
  templateUrl: './add-service.component.html',
  
})
export class AddServiceComponent implements OnInit {

  newService = new Service();

  constructor(private serviceService: ServiceService) { }

  ngOnInit(): void {
  }

  addService(){
    //console.log(this.newService);
    this.serviceService.ajouterService(this.newService );

  }

 

}
