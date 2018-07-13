import models.League;
import models.Player;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Team team;
    League league;

    @Before
    public void setup(){
        team = new Team("Team", league);
        player = new Player("John", "Smith", team);
    }

    @Test
    public void hasName(){
        assertEquals("John", player.getFirstName());
    }

    @Test
    public void hasTeam(){
        assertEquals(team, player.getTeam());
    }
}
