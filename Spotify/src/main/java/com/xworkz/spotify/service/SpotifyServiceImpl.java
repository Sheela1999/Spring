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
		if (dto == null) {
		model.addAttribute("dtoValidate", "Dto is Null");
		System.out.println("Dto is Null");
		  valid = false;
		}
			
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
			return valid;
		
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
		if (songName != null && songName.length() >= 4) {
			SongDto found = repo.findBySongName(songName);
			if (found != null) {
				return found;
			}
			model.addAttribute("SongNotFound", "Song Not Found, Please add this Song");
			System.out.println("Song Not Found, Please add this Song");
			return null;
		}
		model.addAttribute("IsSongNameValid", "song name is not valid");
		System.out.println("song name is not valid");
		return null;

	}
	
	@Override
	public boolean updateArtistBySong(String artist, String songName,Model model) {
		boolean valid=true;
		if(artist==null || artist.length()<3 ||artist.isEmpty()) {
			model.addAttribute( "artistvalidate", "Given ArtistName is not valid");
			valid= false;
		}
			if(songName==null || songName.length()<3 || songName.isEmpty()) {
				model.addAttribute("songNameValidate", "Given SongName is not valid");
				valid= false;
			}
				
			boolean update =repo.updateArtistBySong(artist,songName);
			return update;
					
		
	}

	@Override
	public boolean deleteByAlbum(String album, Model model) {
		boolean valid=true;
		if(album==null || album.length()<3 || album.isEmpty()) {
			model.addAttribute("albumValidate", "Given album is not valid");
			valid= false;
		}
		
		boolean dlt = repo.deleteByAlbum(album);
		return dlt;	
	
	}
}
