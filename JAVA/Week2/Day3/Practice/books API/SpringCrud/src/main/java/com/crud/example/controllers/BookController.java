package com.crud.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.example.models.Book;
import com.crud.example.services.BookService;

@RestController
@RequestMapping ("/api/books")
public class BookController {
	
	    private final BookService bookService;
	    public BookController(BookService bookService){
	        this.bookService = bookService;
	    }
	@GetMapping("")
	public List<Book>  getAllBooks(){
		List<Book> bookList=bookService.allBooks();
		return bookList;
	}

}
