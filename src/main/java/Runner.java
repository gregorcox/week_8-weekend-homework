import db.DBHelper;
import models.League;
import models.Manager;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String[] args) {

        League league = new League("The Premier League");
        DBHelper.save(league);

        Team team1 = new Team("Liverpool", league);
        DBHelper.save(team1);

        Team team2 = new Team("Manchester United", league);
        DBHelper.save(team2);

        Team team3 = new Team("Chelsea", league);
        DBHelper.save(team3);

        Player player1 = new Player("Roberto", "Firmino", team1);
        DBHelper.save(player1);

        Player player2 = new Player("Romelu", "Lukaku", team2);
        DBHelper.save(player2);

        Player player3 = new Player("Eden", "Hazard", team3);
        DBHelper.save(player3);

        Manager manager1 = new Manager("Jurgen", "Klopp", team1);
        DBHelper.save(manager1);

        Manager manager2 = new Manager("Jose", "Mourinho", team2);
        DBHelper.save(manager2);

        Manager manager3 = new Manager("Antonio", "Conte", team3);
        DBHelper.save(manager3);



    }


}