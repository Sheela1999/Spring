package com.xworkz.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createBook(BookDto dto, Model model) {
		boolean exist = service.doExist(dto.getBookName(), model);
		if (exist) {
			service.saveBook(dto, model);
			model.addAttribute("dto", "Book is saved");
			return "Create";
		} else {
			model.addAttribute("dto", "Book is not saved");
			return "Create";
		}

	} 

//	@RequestMapping(value = "/find", method = RequestMethod.GET)
//	public String findBook(@RequestParam String bookName,Model model) {
//		service.findByBookName(bookName, model);
//		model.addAttribute("bookName", bookName);
//		return "FindBook";
//		
//	}
}
