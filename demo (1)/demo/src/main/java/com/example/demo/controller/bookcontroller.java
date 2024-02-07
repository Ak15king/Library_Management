package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.bookentity;
import com.example.demo.service.bookservice;

@RestController
public class bookcontroller {
@Autowired
	private bookservice bookService;

 @GetMapping("/all")
	public ResponseEntity<List<bookentity>>getAllBooks(){
	List<bookentity> books = bookService.findAllBooks();
	return new ResponseEntity<>(books,HttpStatus.OK);
	}
	
 @PostMapping("/addn")
	public ResponseEntity<String> addNewBook(@RequestBody bookentity book) {
	 
	 System.out.println("came here");
		bookentity insertedBook = bookService.createBook(book);
		
		
		if(insertedBook==null) {
			return new ResponseEntity <String> (HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Inserted Successfully...",HttpStatus.OK);
	}
	
 @PostMapping("/update")
	public ResponseEntity updateBook(@RequestBody bookentity book) {
		bookService.updateBook(book);
		return new ResponseEntity<>("Updated Successfully...",HttpStatus.OK);
	}
 
 @DeleteMapping("/delete/{id}")
 public ResponseEntity deleteBook(@PathVariable("id") Long id) {
	 bookService.deleteBook(id);
	 return new ResponseEntity<>("Deleted successfully...",HttpStatus.OK);
 }
}
