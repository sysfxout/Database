package org.ysc.database.model;

import javax.persistence.*;

@Entity
@Table(name = "playerinfo")
public class PlayerInfo {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "Tournament")
	private String tournament;
	@Column(name = "Year")
	private String year;
	@Column(name = "Season")
	private String season;
	@Column(name = "Region")
	private String region;
	@Column(name = "Week")
	private int week;
	@Column(name = "Day")
	private int day;
	@Column(name = "Game")
	private int game;
	@Column(name = "Name")
	private String name;
	@Column(name = "Champion")
	private String champion;
	@Column(name = "ChampionId")
	private int championId;
	@Column(name = "Position")
	private String position;
	@Column(name = "Team")
	private String team;
	@Column(name = "Opp")
	private String opp;
	@Column(name = "Result")
	private String result;
	@Column(name = "Time")
	private String time;
	@Column(name = "MatchLink")
	private String matchLink;
	@Column(name = "AcsLink")
	private String acsLink;
	

	public void update() {
		StringBuilder sb = new StringBuilder();
		sb.append(tournament);
		sb.append(year);
		sb.append("-"+region);
		sb.append("-W"+week);
		sb.append("D"+day);
		sb.append("G"+game);
		sb.append("-"+name);
		id = sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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

	
	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
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

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
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

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public String getAcsLink() {
		return acsLink;
	}

	public void setAcsLink(String acsLink) {
		this.acsLink = acsLink;
	}

}
