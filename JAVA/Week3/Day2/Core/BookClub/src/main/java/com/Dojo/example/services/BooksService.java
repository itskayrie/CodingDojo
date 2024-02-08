package com.Dojo.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dojo.example.models.Book;
import com.Dojo.example.repositories.BooksRepository;



@Service
public class BooksService {
	

	// DI
	@Autowired
	private BooksRepository BookRepo;
	// READ ALL
	public List<Book> allBooks(){
		return BookRepo.findAll();
	}
	// CREATE
	public Book createBook(Book b) {
		return BookRepo.save(b);
	}
	
	
	// READ ONE
	public Book findBookById(Long id) {
		Optional<Book> maybeBook = BookRepo.findById(id);
		if(maybeBook.isPresent()) {
			return maybeBook.get();
		}else {
			return null;
		}
	}
	
	// UPDATE
	public Book updateBook(Book b) {
		return BookRepo.save(b);
	}
	
	// DELETE
	public void deleteBook(Long id) {
		BookRepo.deleteById(id);
	}
	
}
