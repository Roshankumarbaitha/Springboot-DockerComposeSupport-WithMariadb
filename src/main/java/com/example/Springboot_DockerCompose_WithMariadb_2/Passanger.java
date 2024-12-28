package com.example.Springboot_DockerCompose_WithMariadb_2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="passangerlist")
public class Passanger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String seatno;
	String BordingStationName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public String getBordingStationName() {
		return BordingStationName;
	}
	public void setBordingStationName(String bordingStationName) {
		BordingStationName = bordingStationName;
	}
	

}
