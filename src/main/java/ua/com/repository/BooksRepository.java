package ua.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{


}
