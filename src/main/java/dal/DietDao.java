package dal;

import dao.Diet;
import java.util.List;

public interface DietDao {
    void save(Diet entity);
    List<Diet> findAll();

}
