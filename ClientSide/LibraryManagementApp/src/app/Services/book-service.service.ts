import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const Base_url="http://localhost:5000/books";
@Injectable({
  providedIn: 'root'
})


export class BookServiceService {

  saveBook(book:{
  book_name:String,
  book_author:String,
  book_price:Number,
  book_genre:String,
  borrowed_status:String

})

{
  return this.http.post(Base_url,book);
}

 getBooks(){
   return this.http.get(Base_url);
 }

 deleteBook(book:any)
{
  return this.http.delete(Base_url+"/"+book.id)
}

  constructor(public http:HttpClient) { }
}
