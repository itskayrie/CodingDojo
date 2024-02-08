package com.Dojo.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dojo.example.models.Book;
import com.Dojo.example.models.User;
import com.Dojo.example.services.BooksService;
import com.Dojo.example.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {
	 @Autowired
     private UserService userServ;
     @Autowired
     private BooksService BookServ;
     
     @GetMapping("")
     public String welcome(Model m,HttpSession session) {
    	 Long userId = (Long) session.getAttribute("user_id");
 		if(userId == null) {
 			return "redirect:/";
 		}
 		User user = userServ.findUserById(userId);
 		List<Book> allBooks = BookServ.allBooks();
		m.addAttribute("allBooks",allBooks);
		m.addAttribute("user",user);
         return "Dashboard.jsp";
     }
     
     @GetMapping("/new")
     public String addbook(@ModelAttribute("Book") Book Book,HttpSession session) {
    	 Long userId = (Long) session.getAttribute("user_id");
  		if(userId == null) {
  			return "redirect:/";
  		}
    	 return "create.jsp";
     }
     @PostMapping("/processBook")
 	public String createBook(@Valid @ModelAttribute("Book") Book Book,BindingResult result,Model model,HttpSession s) {
    	 Long userId = (Long) s.getAttribute("user_id");
	  		if(userId == null) {
	  			return "redirect:/";
	  		}
    	 if (result.hasErrors()) {
 			return "showOne.jsp";
 		}else {
			// grab the user by their id
			User user = userServ.findUserById(userId);
			Book.setUser(user);
 			Book newBook = BookServ.createBook(Book);
 			return "redirect:/books";
 		}}
     @GetMapping("/{id}")
     public String onebook(Model model, @PathVariable("id") Long id,HttpSession session) {
    	 Long userId = (Long) session.getAttribute("user_id");
  		if(userId == null) {
  			return "redirect:/";
  		}
    	 User user = userServ.findUserById(userId);
 		model.addAttribute("user",user);
    	 Book selectedBook=BookServ.findBookById(id);
    	 model.addAttribute("Book",selectedBook);
    	 return "showOne.jsp";
     }
     @DeleteMapping("/delete/{id}")
 		public String deleteBook(@PathVariable("id") Long id,HttpSession session) {
    	 Long userId = (Long) session.getAttribute("user_id");
  		if(userId == null) {
  			return "redirect:/";
  		}
  		BookServ.deleteBook(id);
 		return "redirect:/books";
 	}
     @GetMapping("/edit/{id}")
		public String getMethodName(Model model, @PathVariable("id") Long id,HttpSession session) {
    	 Long userId = (Long) session.getAttribute("user_id");
  		if(userId == null) {
  			return "redirect:/";
  		}
		
			Book selected = BookServ.findBookById(id);
			model.addAttribute("Book",selected);
			return "update.jsp";
		}
		
		@PutMapping("/update/{id}")
		public String editExp(@Valid @ModelAttribute("Book") Book Book, BindingResult result,HttpSession s) {
			Long userId = (Long) s.getAttribute("user_id");
		  		if(userId == null) {
		  			return "redirect:/";
		  		}
				
			if(result.hasErrors()) {
				return "update.jsp";
			}else {
				
				// grab the user by their id
				User user = userServ.findUserById(userId);
				Book.setUser(user);
				BookServ.createBook(Book);
			
				return "redirect:/books";
			}
		}
}