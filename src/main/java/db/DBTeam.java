package db;

import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBTeam {

    public static Session session;

    public static List<Player> getPlayersOnTeam(Team team){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Player> results = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.add(Restrictions.eq("team", team));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }


}
