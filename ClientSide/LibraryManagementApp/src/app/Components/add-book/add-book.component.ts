import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Model/book';
import { BookServiceService } from 'src/app/Services/book-service.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  book:Book= new Book();

  save(){
  
    const observable=this.bookService.saveBook(this.book);
    observable.subscribe(
      (response: any) => {
        console.log(response);
      },function(error){
        console.log(error);
        alert("something went wrong please try again")
 
        }
    )

  }



  constructor(private bookService:BookServiceService) { }

  ngOnInit(): void {
  }

}
