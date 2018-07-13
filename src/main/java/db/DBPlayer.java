package db;

import models.Manager;
import models.Player;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DBPlayer {

    private static Session session;
    private static Transaction transaction;


    public static Manager getPlayersManager(Player player){
        session = HibernateUtil.getSessionFactory().openSession();
        Manager manager = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Manager.class);
            cr.add(Restrictions.eq("team", player.getTeam()));
            manager = (Manager)cr.uniqueResult();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return manager;
    }


}
