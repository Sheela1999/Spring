package com.xworkz.book.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.book.dto.BookDto;

public interface BookService {
	
	public boolean validate(BookDto dto, Model model);
	
	public boolean saveBook(BookDto dto, Model model);
	
	public BookDto findByBookName(String bookName, Model model);
	
	public List<BookDto> readAll();
	
	public boolean doExist(String name,Model model);

}
