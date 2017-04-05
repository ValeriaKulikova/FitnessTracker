package dal.impl;

import dal.DietDao;
import dao.Diet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DietDaoImpl implements DietDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save (Diet entity) {
        Session session=this.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();

        session.persist(entity);

      tx.commit();
      session.close();
    }


    @SuppressWarnings("unchecked")
     public List<Diet> findAll() {
        Session session=this.sessionFactory.openSession();
        List<Diet> personList = session.createQuery("from Diet").list();
        session.close();
        return  personList;

    }

}
