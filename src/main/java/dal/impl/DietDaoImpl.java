package dal.impl;

import dal.DietDao;
import dal.impl.mapper.DietRowMapper;
import dao.Diet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DietDaoImpl implements DietDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

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

    public List<Diet> findByTime(int time) {
        return null;
    }

    public Diet findByNameOfDietAndTimeOfDiet(String nameOfDiet, String timeOfDiet) {

        DataSource dataSource = null;
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        String sql = ""
                + " SELECT * FROM JAVA_TASK.DIET "
                + " WHERE NAME_OF_DIET = ? "
                + " AND TIME_OF_DIET= ? ";

        Diet diet = (Diet) jdbc.queryForObject(
                sql,
                new Object[] { nameOfDiet, timeOfDiet },
                new DietRowMapper(Diet.class)
        );
        return  diet;
    }

}
