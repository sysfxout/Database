package org.ysc.database.model;

import javax.persistence.*;

@Entity
@Table(name = "playerfantasystats")
public class PlayerFantasyStats {

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "AD")
	private double ad;
	@Column(name = "DK")
	private double dk;
	@Column(name = "eSports")
	private double eSports;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAd() {
		return ad;
	}
	public void setAd(double ad) {
		this.ad = ad;
	}
	public double getDk() {
		return dk;
	}
	public void setDk(double dk) {
		this.dk = dk;
	}
	public double geteSports() {
		return eSports;
	}
	public void seteSports(double eSports) {
		this.eSports = eSports;
	}
	
	
}
