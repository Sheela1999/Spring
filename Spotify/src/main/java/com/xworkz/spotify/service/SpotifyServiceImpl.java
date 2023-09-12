package com.xworkz.spotify.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.repository.SpotifyRepository;

@Service
public class SpotifyServiceImpl implements SpotifyService {

	@Autowired
	private SpotifyRepository repo;

	@Override
	public boolean validate(SongDto dto, Model model) {
		boolean valid = true;
		if (dto != null) {
			System.out.println("dto is valid");
			if (dto.getSongName() == null || dto.getSongName().length() <= 3 || dto.getSongName().isEmpty()) {
				model.addAttribute("IsSongValid", "Song name is not valid");
				valid = false;
			}
			if (dto.getArtist() == null || dto.getArtist().length() <= 3 || dto.getArtist().isEmpty()) {
				model.addAttribute("IsArtistNameValid", "Artist name is not valid");
				valid = false;
			}
			if (dto.getRatings() == null || dto.getRatings() <= 2) {
				model.addAttribute("IsRatingValid", "Ratings are not valid");
				valid = false;
			}
			if (dto.getAlbum().length() <= 3 || dto.getAlbum().isEmpty()) {
				model.addAttribute("IsAlbumValid", "Album is not valid");
				valid = false;
			}
			if (dto.getComposer().length() <= 3 || dto.getComposer().isEmpty()) {
				model.addAttribute("IsComposerValid", "Composer name is not valid");
				valid = false;
			}
		}

		model.addAttribute("dtoValidate", "Dto is Null");
		System.out.println("Dto is Null");
		return valid = false;
	}

	@Override
	public boolean saveSong(SongDto dto, Model model) {
		boolean validated = validate(dto, model);

		if (validated == true) {
			repo.saveSong(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<SongDto> readAll() {
		List<SongDto> list = repo.readAll();
		return list;
	}

	@Override
	public SongDto findBySongName(String songName, Model model) {
		if(songName != null && !songName.isEmpty()) {
			try {
				SongDto dto = repo.findBySongName(songName, model);
				return dto;
			} catch (NoResultException e) {
				model.addAttribute("SongNotFound", "Song Not Found, Please add this Song");
				e.printStackTrace();
				return null;
			}
		}
		model.addAttribute("IsSongNameValid", "song name is not valid");
		System.out.println("song name is not valid");
		return null;
		
	}
}
