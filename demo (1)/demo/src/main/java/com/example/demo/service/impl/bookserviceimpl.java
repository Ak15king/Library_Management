package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.bookentity;
import com.example.demo.reppo.bookreppo;
import com.example.demo.service.bookservice;

@Service
public class bookserviceimpl implements bookservice {
 @Autowired
	private bookreppo bookReppo;
	@Override
	public List<bookentity> findAllBooks() {
		// TODO Auto-generated method stub
		return bookReppo.findAll();
	}

	@Override
	public bookentity createBook(bookentity book) {
		// TODO Auto-generated method stub
		return bookReppo.save(book);
	}

	@Override
	public void updateBook(bookentity book) {
		// TODO Auto-generated method stub
		bookReppo.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookReppo.deleteById(id);
	}

	@Override
	public Optional<bookentity> findBookById(Long id) {
		// TODO Auto-generated method stub
		return bookReppo.findById(id);
	}
 
}
