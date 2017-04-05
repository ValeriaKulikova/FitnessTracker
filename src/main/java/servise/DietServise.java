package servise;


import dal.DietDao;
import dao.Diet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DietServise {
    @Autowired
    private DietDao dietDao;

    public void saveNewDiet(Diet diet){

    }
}
