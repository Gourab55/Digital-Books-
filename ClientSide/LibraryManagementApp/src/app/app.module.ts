import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { AddBookComponent } from './Components/add-book/add-book.component';
import { NavBarComponent } from './Components/nav-bar/nav-bar.component';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ListBooksComponent } from './Components/list-books/list-books.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    AddBookComponent,
    NavBarComponent,
    ListBooksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
