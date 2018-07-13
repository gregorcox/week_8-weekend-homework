import models.League;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    Team team;
    League league;

    @Before
    public void setup(){
        league = new League("League");
        team = new Team("Team", league);
    }

    @Test
    public void hasName(){
        assertEquals("Team", team.getName());
    }

    @Test
    public void hasLeague(){
        assertEquals(league, team.getLeague());
    }


}
