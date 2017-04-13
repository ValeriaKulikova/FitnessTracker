package dal.impl;

import dal.ProductDao;
import dal.impl.mapper.ProductRowMapper;
import dao.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save (Product entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(entity);
        tx.commit();
        session.close();
    }

    public List<Product> findAll() {
        JdbcTemplate jdbc=new JdbcTemplate(dataSource);
        String sql="SELECT * FROM JAVA_TASK.PPODUCT";
        List<Product> products = jdbc.query(
                sql,
                new ProductRowMapper(Product.class)
        );

        return products;
    }



    public Product findById(Long productId) {
        return null;
    }


}


