package org.ysc.db;

import org.ysc.database.model.FantasyPlayer;
import org.ysc.database.model.Match;
import org.ysc.database.model.dao.FantasyPlayerDAO;
import org.ysc.database.model.dao.MatchDAO;

/**
 * Hello world!
 *
 */
public class AppTest 
{
	
    public static void main( String[] args )
    {
       //testMatch();
       testFantasyPlayer();
    	System.exit(0);
    }
    
    private static void testMatch(){
    	 Match match = createTestMatch();
         MatchDAO matchDAO = new MatchDAO();
         matchDAO.create(match);
    }
    
    private static void testFantasyPlayer(){
    	FantasyPlayer fantasyPlayer = createTestFantasyPlayer();
    	FantasyPlayerDAO fantasyPlayerDAO = new FantasyPlayerDAO();
    	fantasyPlayerDAO.create(fantasyPlayer);
    }
    
    private static Match createTestMatch(){
        Match match = new Match();
        match.setTournamentId("MSI");
        match.setYear(16);
        match.setRegion("NA");
        match.setTeam1("RED");
        match.setTeam2("BLUE");
        match.setMatchURL("http://matchurl.com");
        match.setAcsURL("http://acsurl.com");
        match.setWeek(1);
        match.setDay(1);
        match.setGame(1);
        match.initId();
        return match;
    }
    
    private static FantasyPlayer createTestFantasyPlayer(){
    	FantasyPlayer fantasyPlayer = new FantasyPlayer();
    	fantasyPlayer.setSeason("MSI16");
    	fantasyPlayer.setRegion("NA");
    	fantasyPlayer.setGame("W1D1G1");
    	fantasyPlayer.setName("Test");
    	fantasyPlayer.setChampion("ChampTest");
    	fantasyPlayer.setPosition("pos");
    	fantasyPlayer.setTeam("team");
    	fantasyPlayer.setOpp("Op");
    	fantasyPlayer.setResult("Win");
    	fantasyPlayer.setTime("36:54");
    	fantasyPlayer.setAd(30.3);
    	fantasyPlayer.setDk(23.4);
    	fantasyPlayer.seteSports(3.0);
    	fantasyPlayer.setLink("link");
    	fantasyPlayer.update();
    	return fantasyPlayer;
    }
}
