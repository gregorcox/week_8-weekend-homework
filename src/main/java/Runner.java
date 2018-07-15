import db.DBHelper;
import db.DBLeague;
import db.DBPlayer;
import db.DBTeam;
import models.League;
import models.Manager;
import models.Player;
import models.Team;

import java.util.List;

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

        Player player4 = new Player("Sadio", "Mane", team1);
        DBHelper.save(player4);

        Manager manager1 = new Manager("Jurgen", "Klopp", team1);
        DBHelper.save(manager1);

        Manager manager2 = new Manager("Jose", "Mourinho", team2);
        DBHelper.save(manager2);

        Manager manager3 = new Manager("Antonio", "Conte", team3);
        DBHelper.save(manager3);

//        DBPlayer.playerTransfer(player4, team2);

        List<Player> liverpoolPlayers = DBTeam.getPlayersOnTeam(team1);

        List<Team> premierLeagueTeams = DBLeague.getTeamsInLeague(league);

        Manager FirmonosManager = DBPlayer.getPlayersManager(player1);




    }


}