import models.League;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    League league;
    Team team;
    ArrayList<Team> teams;

    @Before
    public void setup(){
        league = new League("The Premier League");
        team = new Team("Liverpool", league);
        teams = new ArrayList<Team>();
    }

    @Test
    public void hasName(){
        assertEquals("The Premier League", league.getName());
    }

}
