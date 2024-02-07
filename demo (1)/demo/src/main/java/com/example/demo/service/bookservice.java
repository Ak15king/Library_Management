package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.bookentity;

public interface bookservice {
	
  List<bookentity>findAllBooks();
  
  bookentity createBook(bookentity book);
  
  void updateBook(bookentity book);
  
  void deleteBook(Long id);
  
  Optional<bookentity>findBookById(Long id);
}
