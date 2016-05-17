package org.ysc.db;

import org.ysc.database.model.PlayerFantasyStats;
import org.ysc.database.model.PlayerInfo;
import org.ysc.database.model.dao.PlayerFantasyStatsDAO;
import org.ysc.database.model.dao.PlayerInfoDAO;

/**
 * Hello world!
 *
 */
public class AppTest {
	
	private static String tournament = "MSI", year = "16", region = "NA";
	private static int week = 1, day = 1, game = 1;
	private static String name = "Test";
	
	public static void main(String[] args) {
		testPlayerInfo();
		testPlayerFantasyStats();
		System.exit(0);
	}

	private static void testPlayerInfo() {
		PlayerInfo playerInfo = createTestPlayerInfo();
		PlayerInfoDAO playerInfoDAO = new PlayerInfoDAO();
		playerInfoDAO.create(playerInfo);
	}

	private static PlayerInfo createTestPlayerInfo() {
		PlayerInfo playerInfo = new PlayerInfo();
		playerInfo.setTournament(tournament);
		playerInfo.setYear(year);
		playerInfo.setRegion(region);
		playerInfo.setWeek(week);
		playerInfo.setDay(day);
		playerInfo.setGame(game);
		playerInfo.setName(name);
		playerInfo.setChampion("ChampTest");
		playerInfo.setPosition("pos");
		playerInfo.setTeam("team");
		playerInfo.setOpp("Op");
		playerInfo.setResult("Win");
		playerInfo.setTime("36:54");
		playerInfo.setMatchLink("matchLink");
		playerInfo.setAcsLink("acsLink");
		
		playerInfo.update();
		return playerInfo;
	}
	
	private static void testPlayerFantasyStats(){
		PlayerFantasyStats playerFantasyStats = createTestPlayerFantasyStats();
		PlayerFantasyStatsDAO playerFantasyStatsDAO = new PlayerFantasyStatsDAO();
		playerFantasyStatsDAO.create(playerFantasyStats);
	}

	private static PlayerFantasyStats createTestPlayerFantasyStats() {
		PlayerFantasyStats playerFantasyStats = new PlayerFantasyStats();
		
		StringBuilder sb = new StringBuilder();
		sb.append(tournament);
		sb.append(year);
		sb.append("-"+region);
		sb.append("-W"+week);
		sb.append("D"+day);
		sb.append("G"+game);
		sb.append("-"+name);
		playerFantasyStats.setId(sb.toString());
		playerFantasyStats.setAd(1.0);
		playerFantasyStats.setDk(2.0);
		playerFantasyStats.seteSports(3.0);
		
		return playerFantasyStats;
	}
	
	
}
