package com.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.Exception.ResourceNotFoundException;

import com.Library.entity.Book;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	IBookRepo  ibookrepo;
	
	@Override
	public Integer createBook(Book book) {
		Book createBook=ibookrepo.save(book);
		return createBook.getId();
	}

	@Override
	public List<Book> getallBooks() {
		
		return ibookrepo.findAll();
	}

	@Override
	public Optional<Book> getBooksByid(Integer id) {
		
		return ibookrepo.findById(id);
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		//first we need to check whether that book exist or not
		Book existingBook=ibookrepo.findById(id).orElseThrow(
		() -> new ResourceNotFoundException("Book","id", id));
		
		existingBook.setBook_name(book.getBook_name());
		existingBook.setBook_author(book.getBook_author());
		existingBook.setPrice(book.getPrice());
		existingBook.setBook_genre(book.getBook_genre());
		existingBook.setBorrowed_status(book.getBorrowed_status());
		
		
		ibookrepo.save(existingBook);
		return existingBook;
	}

	@Override
	public void DeleteBook(Integer id) {
	  
		ibookrepo.deleteById(id);
	}

	@Override
	public Book changeStatus(Book book,Integer id) {
		
		Book existingBook=ibookrepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Book","id", id));
				
				existingBook.setBook_name(existingBook.getBook_name());
				existingBook.setBook_author(existingBook.getBook_author());
				existingBook.setPrice(existingBook.getPrice());
				existingBook.setBook_genre(existingBook.getBook_genre());
				
				existingBook.setBorrowed_status(book.getBorrowed_status());
		
		
				

		  ibookrepo.save(existingBook);
		   return existingBook;
	}

	

}

//Book existingBook=ibookrepo.findById(id).orElseThrow(
//		() -> new ResourceNotFoundException("Book","id", id));
//		
//existingBook.getBook_name();
//existingBook.getBook_author();
//existingBook.getPrice();
//existingBook.getBook_genre();
//		existingBook.setBorrowed_status(book.getBorrowed_status());
