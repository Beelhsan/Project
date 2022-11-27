import { User } from './../model/user.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styles: [
  ]
})
export class LoginComponent implements OnInit {
   
  user = new User();
  constructor() { }

  ngOnInit(): void {
  }
  onLoggedin()
  {
    console.log(this.user);
  }

}
