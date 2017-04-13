package dal;

import dao.Diet;
import java.util.List;

public interface DietDao {
    void save(Diet entity);
    List<Diet> findAll();

    List<Diet> findByTime(int time);

    Diet findByNameOfDietAndTimeOfDiet(String nameOfDiet, String timeOfDiet);

}
