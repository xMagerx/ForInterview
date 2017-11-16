package ua.com.controller;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.entity.Books;
import ua.com.service.BooksService;
import ua.com.service.impl.BooksServiceImpl;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
		BooksService service = context.getBean(BooksServiceImpl.class);
		service.save(new Books("Harry Poter","Nikita"));
		service.save(new Books("Ronaldo Life","Ronaldo"));
		service.save(new Books("Konfetki","Poroshenko"));
		service.findAll().forEach(System.out::println);
		System.out.println("---------------");
	//	service.delete(3);
		

//      
      System.out.println("Click the appropriate number to go to the action you want:");
      System.out.println("");
      System.out.println("1)I want add book.");
      System.out.println("2)I want remove book.");
      System.out.println("3)Show a list of all books.");
      System.out.println("4)Exit.");
      System.out.println();
      Scanner sc = new Scanner(System.in);
      
      
      boolean situation = true;
     
      while(situation){
      	int number = sc.nextInt();
      	switch(number) {
      	case 1 :{
      		System.out.println("Add title of the book");
          Books books = new Books();
          String book = sc.next();
          books.setBook_name(book);
          System.out.println("Add author");
          String author = sc.next();
          books.setBook_author(author);
          service.save(books);
          System.out.println("book"+author+book+"was added");
          break;
      	}
      	case 2:{
      		System.out.println("Enter the id of the book to delete.");
      		int rem = sc.nextInt();
      		service.delete(rem);
      		System.out.println("book with id:"+rem+"was removed");
//      		service.findByTitle(rem).forEach(System.out::println);;
      		break;

      	}
      	case 3:{
    		service.findAll().forEach(System.out::println);
    		break;
    		
      	}
    	case 4:{
		situation=false;
		System.out.println("EXIT");
		break;
	}
    	default:{
		System.out.println("ERROR!!!");
		break;
      	}
      	}

	}
      
     context.close(); 	
}
}