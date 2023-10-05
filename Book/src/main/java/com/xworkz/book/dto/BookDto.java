package com.xworkz.book.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "book_info")
@Entity
@NamedQuery(name = "findByBookName", query = "select dto from BookDto dto where dto.bookName=:bn")
@NamedQuery(name = "readAll", query = "select dto from BookDto dto")
public class BookDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bookName;
	private String author;
	private String publisher;
	private Integer publishedIn;
	private String language;
	private String content;

	public BookDto() {
		super();
	}

	public BookDto(int id, String bookName, String author, String publisher, Integer publishedIn, String language,
			String content) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.publishedIn = publishedIn;
		this.language = language;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPublishedIn() {
		return publishedIn;
	}

	public void setPublishedIn(Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BookDto [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher
				+ ", publishedIn=" + publishedIn + ", language=" + language + ", content=" + content + "]";
	}

}
