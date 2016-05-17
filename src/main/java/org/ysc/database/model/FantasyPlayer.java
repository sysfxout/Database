package org.ysc.database.model;

import javax.persistence.*;

@Entity
@Table(name = "FantasyPlayers")
public class FantasyPlayer {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "season")
	private String season;
	@Column(name = "region")
	private String region;
	@Column(name = "game")
	private String game;
	@Column(name = "name")
	private String name;
	@Column(name = "champion")
	private String champion;
	@Column(name = "position")
	private String position;
	@Column(name = "team")
	private String team;
	@Column(name = "opp")
	private String opp;
	@Column(name = "result")
	private String result;
	@Column(name = "time")
	private String time;
	@Column(name = "AD")
	private double ad;
	@Column(name = "DK")
	private double dk;
	@Column(name = "eSports")
	private double eSports;
	@Column(name = "Link")
	private String link;
	
	public void update(){
		id = season+""+region+""+game;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChampion() {
		return champion;
	}
	public void setChampion(String champion) {
		this.champion = champion;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getOpp() {
		return opp;
	}
	public void setOpp(String opp) {
		this.opp = opp;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	
}
