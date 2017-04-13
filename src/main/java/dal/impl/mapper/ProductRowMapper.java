package dal.impl.mapper;

import dao.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper extends BeanPropertyRowMapper {

    public ProductRowMapper (Class mappedClass) {super(mappedClass);}

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
        Product product = new Product();
        product.setId(rs.getLong("ID"));
        product.setDietId (rs.getLong("DIET_ID"));
        product.setBreakfast(rs.getString("BREAKFAST") );
        product.setDinner(rs.getString("DINNER"));
        product.setSupper(rs.getString("SUPPER"));


return product;
    }
}
