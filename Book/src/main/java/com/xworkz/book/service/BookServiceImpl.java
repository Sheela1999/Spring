package com.xworkz.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repo;

	@Override
	public boolean validate(BookDto dto, Model model) {
		boolean valid = true;
		if (dto == null) {
			model.addAttribute("dtoValidate", "Dto is Null");
			System.out.println("Dto is Null");
			valid = false;
		}
		if (dto.getBookName() == null || dto.getBookName().length() <= 3 || dto.getBookName().isEmpty()) {
			model.addAttribute("IsBookNameValid", "Book Name is not valid");
			System.out.println("Book Name is not valid");
			valid = false;
		}
		if (dto.getAuthor() == null || dto.getAuthor().length() <= 3 || dto.getAuthor().isEmpty()) {
			model.addAttribute("IsAuthorValid", "Author name is not valid");
			valid = false;
		}
		if (dto.getPublisher() == null || dto.getPublisher().length() <= 3 || dto.getPublisher().isEmpty()) {
			model.addAttribute("IsPublisherValid", "not a Valid Publisher");
			valid = false;
		}
		if  ( dto.getPublishedIn()==null|| dto.getPublishedIn() <= 1995 || dto.getPublishedIn() > 2024) {
			model.addAttribute("IsPublishedYearValid", "Published year is Not valid");
			valid = false;
		}
		if (dto.getLanguage() == null || dto.getLanguage().length() <= 3 || dto.getLanguage().isEmpty()) {
			model.addAttribute("IsLanguageValid", "Given Language is not valid");
			valid = false;
		}
		if (dto.getContent() == null || dto.getContent().isEmpty()) {
			model.addAttribute("IsContentValid", "Content not Valid");
		}
		return valid;
	}

	@Override
	public boolean saveBook(BookDto dto, Model model) {
		boolean validated = validate(dto, model);
		if (validated) {
			if(doExist(dto.getBookName(),model)) {
				System.out.println("Book name is fully valid");
			repo.saveBook(dto);
			return true;
				
			}
		}
		return validated;
			
	}

	@Override
	public BookDto findByBookName(String bookName, Model model) {
		if (bookName != null && bookName.length() >= 3) {
			try {
				BookDto found = repo.findByBookName(bookName);
				if (found != null) {
					System.out.println("Name is already exist");
					return found;
					
				}
				//model.addAttribute("Book Is Alrad", "Book Not Found, Please create this book");
				//System.out.println("Book Not Found, Please add this Book");
				//return null;
			} catch (Exception e) {
				model.addAttribute("BookIsValid", "book name is Not  Exist");
				System.out.println("book name is  not Exist");
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}

	@Override
	public List<BookDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean doExist(String name,Model model) {
		if(name!=null) {
			BookDto find =findByBookName( name,  model);
			
			if(find==null) {
				
				return true;
			}else {
				model.addAttribute("BookExist", "This book Already exist");
				return false;
			}
			
		}
		
		return false;
	}

}
