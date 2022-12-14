package com.Library.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library.entity.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Integer>{

}
