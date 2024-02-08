package com.Dojo.example.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	// MEMBER VARIABLES
			@Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			@NotEmpty
			@Size(min = 5, max = 200, message ="you need a book title !")
			private String Title;
			
			 
			@Size(min = 4, max = 100, message ="you need a book author!")
			private String Author;
			@NotEmpty 
			@Size(min = 4, max = 100, message ="you need a book description !")
			private String MyThoughts;
			
			

			// This will not allow the createdAt column to be updated after creation
			  @Column(updatable=false)
			    @DateTimeFormat(pattern="yyyy-MM-dd")
			    private Date createdAt;
			    @DateTimeFormat(pattern="yyyy-MM-dd")
			    private Date updatedAt;
		    

		    @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name="user_id")
		    private User user;
		 // zero args construtor 
			public Book() {
				super();
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitle() {
				return Title;
			}

			public void setTitle(String title) {
				Title = title;
			}

			public String getAuthor() {
				return Author;
			}

			public void setAuthor(String author) {
				Author = author;
			}

			public String getMyThoughts() {
				return MyThoughts;
			}

			public void setMyThoughts(String myThoughts) {
				MyThoughts = myThoughts;
			}

			public Date getCreatedAt() {
				return createdAt;
			}

			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}

			public Date getUpdatedAt() {
				return updatedAt;
			}

			public void setUpdatedAt(Date updatedAt) {
				this.updatedAt = updatedAt;
			}
			public User getUser() {
				return user;
			}



			public void setUser(User user) {
				this.user = user;
			}
		    
		    
		    
}
