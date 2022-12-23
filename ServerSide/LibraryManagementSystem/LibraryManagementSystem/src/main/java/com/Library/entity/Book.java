package com.Library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String book_name;
	private String book_author;
	private float price;
	private String book_genre;
	private boolean borrowed_status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public boolean getBorrowed_status() {
		return borrowed_status;
	}
	public void setBorrowed_status(boolean borrowed_status) {
		this.borrowed_status = borrowed_status;
	}
	public Book(Integer id, String book_name, String book_author, float price, String book_genre,
			boolean borrowed_status) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.price = price;
		this.book_genre = book_genre;
		this.borrowed_status = borrowed_status;
	}
	public Book() {
		super();
	}
	
	
	
	
	
	
	
	

}
