import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { FormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { ServicesComponent } from './services/services.component';
import { AddServiceComponent } from './add-service/add-service.component';


@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    LoginComponent,
    ServicesComponent,
    AddServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
