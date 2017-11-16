package ua.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bookname;
	
	private String book_author;

	public Books(){}
	
	public Books(String book_name, String book_author) {
		this.bookname = book_name;
		this.book_author = book_author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return bookname;
	}

	public void setBook_name(String book_name) {
		this.bookname = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	@Override
	public String toString() {
		return  id+ "."+  book_author + "'"+ bookname + "'";
	}


	
	
	

}
