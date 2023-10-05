package com.xworkz.spotify.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "song_info")
@Entity
@NamedQuery(name = "readAll", query = "select dto from SongDto dto")
@NamedQuery(name = "findBySongName", query = "select dto from SongDto dto where dto.songName=:sn")
@NamedQuery(name="update" , query="update SongDto dto set dto.artist=:an  where  dto.songName=:sn")
@NamedQuery(name="delete", query="delete from SongDto dto where dto.album=:al")
public class SongDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String songName;
	private String artist;
	private Float ratings;
	private String album;
	private String composer;

	public SongDto() {
		super();
	}

	public SongDto(int id, String songName, String artist, Float ratings, String album, String composer) {
		super();
		this.id = id;
		this.songName = songName;
		this.artist = artist;
		this.ratings = ratings;
		this.album = album;
		this.composer = composer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Float getRatings() {
		return ratings;
	}

	public void setRatings(Float ratings) {
		this.ratings = ratings;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	@Override
	public String toString() {
		return "SongDto [id=" + id + ", songName=" + songName + ", artist=" + artist + ", ratings=" + ratings
				+ ", album=" + album + ", composer=" + composer + "]";
	}

}
