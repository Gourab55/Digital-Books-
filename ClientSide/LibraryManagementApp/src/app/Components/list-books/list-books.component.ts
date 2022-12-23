import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Model/book';
import { BookServiceService } from 'src/app/Services/book-service.service';

@Component({
  selector: 'app-list-books',
  templateUrl: './list-books.component.html',
  styleUrls: ['./list-books.component.css']
})
export class ListBooksComponent implements OnInit {


  deleteRow(book, index){
    const observable=this.bookService.deleteBook(book)
    observable.subscribe((response: any) => {
      console.log(response);
       this.books.splice(index,1)
    })
  }



  books:Book[]=[];

  constructor(private bookService:BookServiceService) { }

  ngOnInit(): void {

    const promise= this.bookService.getBooks();
    promise.subscribe((response) => {
      console.log(response);
      this.books= response as Book[];

    })
  }
   
   

}
