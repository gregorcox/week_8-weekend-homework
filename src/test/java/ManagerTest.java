import models.League;
import models.Manager;
import models.Player;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Team team;
    League league;
    Player player;

    @Before
    public void setup(){
        manager = new Manager("John", "Smith", team);
        team = new Team("Team FC", league);
        league = new League("League");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getFirstName());
    }

}
