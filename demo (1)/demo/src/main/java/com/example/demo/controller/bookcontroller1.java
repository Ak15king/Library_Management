package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.bookentity;
import com.example.demo.service.bookservice;


@Controller
public class bookcontroller1 {
	@Autowired
	private bookservice bookService; 
	@GetMapping("/")
	public String getAllBooks(Model model) {
	 List<bookentity> books = bookService.findAllBooks();
	model.addAttribute("books", books);
	return "index";
	}
	 @PostMapping("/addBook")
	  public String addNewBook(bookentity book){
		 bookentity result = bookService.createBook(book);
	    if(result == null){
	      return "redirect:/";
	    }
	    return "redirect:/";
	  }

	  @RequestMapping({"/edit", "/edit/{id}"})
	  public String editBook(Model model, @PathVariable("id") Optional<Long> id) {
	    {
	      if (id.isPresent()) {
	         Optional<bookentity> book = bookService.findBookById(id.get());
	        if (book.isPresent())
	          model.addAttribute("book", book);
	      } else {
	        model.addAttribute("book", new bookentity());
	      }
	      return "add-edit";
	    }
	  }

	  @RequestMapping("/delete/{id}")
	  public String deleteBook(@PathVariable("id") Long id){
	    bookService.deleteBook(id);
	    return "redirect:/";
	  }

}
