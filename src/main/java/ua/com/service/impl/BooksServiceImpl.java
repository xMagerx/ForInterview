package ua.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.entity.Books;
import ua.com.repository.BooksRepository;
import ua.com.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService{
	
	@Autowired
	private BooksRepository booksRepository;

	public void save(Books books) {
		booksRepository.save(books);
	}

	public List<Books> findAll() {
		return booksRepository.findAll();
	}

	public Books findOne(int id) {
		return booksRepository.findOne(id);
	}

	public void delete(int id) {
		booksRepository.delete(id);
	}



	




}
