package com.Library.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Library.entity.Book;
import com.Library.service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	IBookService ibookService;
	
	@PostMapping("/add/book")
	public Integer createBook(@RequestBody Book book) {
		Integer id=ibookService.createBook(book);
		System.out.println(id);
		return id;
		
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getallBooks(){
		return ibookService.getallBooks();
		
	}
	
	@GetMapping("/read/{id}")
	public Optional<Book> getBookById(@PathVariable Integer id){
		
		Optional<Book> book=ibookService.getBooksByid(id);
		return book;
		
	}
	
	@PutMapping("/update/{id}")
	
	public ResponseEntity<Book> UpdateBook(@PathVariable ("id") Integer id,@RequestBody Book book){
		return new ResponseEntity<Book>(ibookService.updateBook(book, id),HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
		
		
	ResponseEntity<Book> responseEntity= new ResponseEntity<>(HttpStatus.OK);
	try {
		ibookService.DeleteBook(id);
		
	} catch ( Exception e) {
		e.printStackTrace();
	   responseEntity= new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	return responseEntity;
	
	}
	
@PutMapping("/borrow/{id}")
	
	public ResponseEntity<Book> changeStatus(@PathVariable ("id") Integer id,@RequestBody Book book){
		return new ResponseEntity<Book>(ibookService.changeStatus(book, id),HttpStatus.OK);
	}
	
	
	

}
