package ua.com.service;

import java.util.List;

import ua.com.entity.Books;

public interface BooksService {
	
	void save(Books books);
	
	List<Books> findAll();
		
	Books findOne(int id);
	
	void delete(int id);
	


	
}
