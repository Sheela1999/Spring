package com.xworkz.book.repository;

import java.util.List;

import com.xworkz.book.dto.BookDto;

public interface BookRepository {
	
	public boolean saveBook(BookDto dto);
	
	public BookDto findByBookName(String bookName) throws Exception;
	
	public List<BookDto> readAll();

}
