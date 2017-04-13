package dal.impl.mapper;

import dao.Diet;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DietRowMapper extends BeanPropertyRowMapper<Diet> {
    public DietRowMapper(Class mappedClass) {super(mappedClass);}

    public Diet mapRow(ResultSet rs, int rowNumber) throws SQLException{
        Diet diet=new Diet();
        diet.setId(rs.getLong("ID"));
        diet.setNameOfDiet(rs.getString("NAME_OF_DIET"));
        diet.setTimeOfDiet(rs.getInt("TIME_OF_DIET"));

        return diet;

    }
}
