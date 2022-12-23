import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  employee={
    "name": "S.Somnath",
    "BaseSalary":1000000,
    "JoinedOn":Date.now(),
    "Qualification":"Scientist",
    "About":"Somanath also served as the Director of Vikram Sarabhai Space Centre (VSSC),Thiruvananthapuram and Director of Liquid Propulsion Systems Centre (LPSC), Thiruvananthapuram.[3][4] Somanath is known for his contributions to launch vehicle design, particularly in the areas of launch vehicle systems engineering, structural design, structural dynamics, and pyrotechnics",
    "Successrate":50.00/100

  }




  constructor() { }

  ngOnInit(): void {
  }

}
