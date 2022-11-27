import { ServiceService } from './../Servs/service.service';
import { Service } from './../model/service.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html'
  
})
export class ServicesComponent implements OnInit {
  services? : Service[]; 
  
  constructor(private serviceService: ServiceService) {
    //this.services=[];

  }
  

  ngOnInit(): void {
    this.services = this.serviceService.listeServices();
  }

}
