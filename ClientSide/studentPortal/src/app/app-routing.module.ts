import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './Components/about/about.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { PipeDemoComponent } from './Components/pipe-demo/pipe-demo.component';
import { RegisteredStudentComponent } from './Components/registered-student/registered-student.component';
import { StudentRegdComponent } from './Components/student-regd/student-regd.component';

const routes: Routes = [{path:"home",
component:HomepageComponent},{path:"register",component:
StudentRegdComponent
},{path:"registered",component:RegisteredStudentComponent},
{path:"about",component:AboutComponent},
{path:"pipe",component:PipeDemoComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
