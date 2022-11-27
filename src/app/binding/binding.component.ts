import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styles: [
  ]
})
export class BindingComponent implements OnInit {
   titre : string = "Demo Data Binding ";
   status : boolean = false;
   nom : string = "Rihem";
  constructor() { }

  ngOnInit(): void {
  }
  changerTitre(){
  this.titre = "Nouveau titre!";
}


}
