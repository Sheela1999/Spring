package com.xworkz.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.service.SpotifyService;

@Controller
public class SongController {
	
	@Autowired
	private SpotifyService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addSongs(SongDto dto, Model model) {
		System.out.println(dto);
	
		boolean savedData = service.saveSong(dto, model);
		if(savedData) {
			model.addAttribute("dto", dto);
			return "Success";
		}else {
			return "Add";
		}
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readSongs(SongDto dto,Model model) {
		List<SongDto> list = service.readAll();
		model.addAttribute("readList", list);
		System.out.println(list);
		return "Read";
	}
	
	@RequestMapping(value = "/find", method=RequestMethod.GET)
	public String findSongs(@RequestParam String songName, Model model) {
		SongDto dto = service.findBySongName(songName, model);
		model.addAttribute("dto", dto);
		return "Read";
		
	}

}
