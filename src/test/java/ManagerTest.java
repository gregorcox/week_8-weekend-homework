import models.League;
import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Team team;
    League league;

    @Before
    public void setup(){
        league = new League("League");
        team = new Team("Team", league);
        manager = new Manager("John", "Smith", team);
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getFirstName());
    }

    @Test
    public void hasTeam(){
        assertEquals(team, manager.getTeam());
    }




}
