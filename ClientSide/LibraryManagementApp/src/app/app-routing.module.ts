import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './Components/add-book/add-book.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { ListBooksComponent } from './Components/list-books/list-books.component';

const routes: Routes = [{path:"add",
component:AddBookComponent},{path:"getall",
component:ListBooksComponent},{path:"home",
component:HomepageComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
