package org.ysc.database.model;

import javax.persistence.*;

@Entity
@Table(name = "Matches")
public class Match {

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "tournamentId")
	private String tournamentId;
	@Column(name = "year")
	private int year;
	@Column(name = "region")
	private String region;
	@Column(name = "team1")
	private String team1;
	@Column(name = "team2")
	private String team2;
	@Column(name = "matchUrl")
	private String matchURL;
	@Column(name = "acsUrl")
	private String acsURL;
	@Column(name = "week")
	private int week;
	@Column(name = "day")
	private int day;
	@Column(name = "game")
	private int game;

	public void initId() {
		id = tournamentId + "" + year + "" + region + "W" + week + "D" + day + "G" + game;
	}

	private void setAcsURL() {
		switch (matchURL) {
		case "http://matchhistory.na.leagueoflegends.com/en/#match-details":
			acsURL = matchURL.replace("http://matchhistory.na.leagueoflegends.com/en/#match-details",
					"https://acs.leagueoflegends.com/v1/stats/game");
			break;
		case "http://matchhistory.eune.leagueoflegends.com/en/#match-details":
			acsURL = acsURL.replace("http://matchhistory.eune.leagueoflegends.com/en/#match-details",
					"https://acs.leagueoflegends.com/v1/stats/game");
			break;
		case "http://matchhistory.na.leagueoflegends.com/en/#match-details/":
			acsURL = acsURL.replace("http://matchhistory.na.leagueoflegends.com/en/#match-details/",
					"https://acs.leagueoflegends.com/v1/stats/game");
			break;
		default:
			acsURL = "UNHANDLED URL: " + matchURL;
			break;
		}

		acsURL = acsURL.replace("&tab=overview", "");
		acsURL = acsURL.replace("&participant=10", "");
	}
	
	//Getter/Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getMatchURL() {
		return matchURL;
	}

	public void setMatchURL(String matchURL) {
		this.matchURL = matchURL;
		setAcsURL();
	}

	public String getAcsURL() {
		return acsURL;
	}

	public void setAcsURL(String acsURL) {
		this.acsURL = acsURL;
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

	@Override
	public String toString() {
		return "Match [tournamentId=" + tournamentId + ", year=" + year + ", region=" + region + ", team1=" + team1
				+ ", team2=" + team2 + ", matchURL=" + matchURL + ", acsURL=" + acsURL + ", week=" + week + ", day="
				+ day + ", game=" + game + "]";
	}
}
