package org.ysc.database;

import org.ysc.database.model.Match;
import org.ysc.database.model.dao.MatchDAO;

/**
 * Hello world!
 *
 */
public class App 
{
	//private static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
        Match match = createTestMatch();
        MatchDAO matchDAO = new MatchDAO();
        matchDAO.create(match);
        System.exit(0);
    }
    
    
    private static Match createTestMatch(){
        Match match = new Match();
        match.setTournamentId("SPR");
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
}
