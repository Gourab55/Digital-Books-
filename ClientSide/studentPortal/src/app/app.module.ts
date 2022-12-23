import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { StudentRegdComponent } from './Components/student-regd/student-regd.component';
import {HttpClientModule} from '@angular/common/http';
import { RegisteredStudentComponent } from './Components/registered-student/registered-student.component'
import { NavbarComponent } from './Components/navbar/navbar.component';
import { AboutComponent } from './Components/about/about.component';
import { ContactUsComponent } from './Components/contact-us/contact-us.component';
import { PipeDemoComponent } from './Components/pipe-demo/pipe-demo.component';
import { EllipsisPipe } from './Pipes/ellipsis.pipe';



@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    StudentRegdComponent,
    RegisteredStudentComponent,
    NavbarComponent,
    AboutComponent,
    ContactUsComponent,
    PipeDemoComponent,
    EllipsisPipe,
   
  
   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
