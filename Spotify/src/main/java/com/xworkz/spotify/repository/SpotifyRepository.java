package com.xworkz.spotify.repository;

import java.util.List;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyRepository {
	
	public boolean saveSong(SongDto dto);

	public List<SongDto> readAll();
	
	public SongDto findBySongName(String songName);

	boolean updateArtistBySong(String artist, String songName);

	boolean deleteByAlbum(String album);

}
