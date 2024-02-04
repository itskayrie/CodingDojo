package com.crud.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
//	@PostMapping("")
//	public Book create(@RequestParam(value = "title") String title, 
//			@RequestParam(value = "description") String description,
//			@RequestParam(value = "language") String language, 
//			@RequestParam(value = "numOfPages") Integer numOfPages) {
//		
//		Book newBook = new Book(title, description, language, numOfPages );
//		
//		return bookService.createBook(newBook);
//	}
	@PostMapping("/processBook")
	public String create(@ModelAttribute Book newBook) {
	    bookService.createBook(newBook);
	    return "redirect:/books";
	}

	@GetMapping("/{id}")
	public Book findOneBookById(@PathVariable("id") Long id) {
		return bookService.findBook(id);
	}
}
