import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/Services/student.service';
import Student from 'src/app/Entity/Student';
@Component({
  selector: 'app-registered-student',
  templateUrl: './registered-student.component.html',
  styleUrls: ['./registered-student.component.css']
})
export class RegisteredStudentComponent implements OnInit {




  deleteRow(student, index){
    const observable=this.studenentService.deleteStudent(student)
    observable.subscribe((Response: any) => {
      console.log(Response);
      this.students.splice(index,1)
    })
  }

 sort(){
   this.students.sort(function(student1,student2){
     return student1.class- student2.class
   })
 }



  students : Student[]=[];
  constructor(private studenentService: StudentService) { }

  ngOnInit(): void {

    const promise= this.studenentService.getStudents();
    promise.subscribe((Response) => {
    console.log(Response);
    this.students= Response as Student[];
  })

 }
}
