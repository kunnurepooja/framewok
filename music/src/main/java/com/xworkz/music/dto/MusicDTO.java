package com.xworkz.music.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "music")
public class MusicDTO {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name = "albumname")
	private String albumName;
	@Column(name = "singer")
	private String singer;
	@Column(name = "company")
	private String company;
	@Column(name = "year")
	private int year;

	public MusicDTO(String albumName, String singer, String company, int year) {

		this.albumName = albumName;
		this.singer = singer;
		this.company = company;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getAlbum() {
		return albumName;
	}

	public void setAlbum(String album) {
		this.albumName = albumName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
