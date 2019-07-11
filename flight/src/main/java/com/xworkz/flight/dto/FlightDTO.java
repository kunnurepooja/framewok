package com.xworkz.flight.dto;

import java.io.Serializable;

public class FlightDTO implements Serializable {

	private String name;
	private int passanger;
	private String airport;
	private String arrivale;
	private String departure;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassanger() {
		return passanger;
	}

	public void setPassanger(int passanger) {
		this.passanger = passanger;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getArrivale() {
		return arrivale;
	}

	public void setArrivale(String arrivale) {
		this.arrivale = arrivale;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return "FlightDTO [name=" + name + ", passanger=" + passanger + ", airport=" + airport + ", arrivale="
				+ arrivale + ", departure=" + departure + "]";
	}

}
