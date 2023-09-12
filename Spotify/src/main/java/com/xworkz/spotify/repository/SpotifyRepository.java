package com.xworkz.spotify.repository;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyRepository {
	
	public boolean saveSong(SongDto dto);

	public List<SongDto> readAll();
	
	public SongDto findBySongName(String songName, Model model);

}
