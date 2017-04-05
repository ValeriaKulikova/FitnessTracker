package logic;

import dao.Diet;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import servise.ProductServise;
import servise.DietServise;

import javax.persistence.Table;

@Ignore
public class ProductServiseTest {
    @Autowired
    private ProductServise productServise;

    private DietServise dietServise = new DietServise();

    @Before
    public void setup() throws Exception{

    }

    @Test
    public void testSaveRecord() throws Exception {
        System.out.println("test");
    //      Diet diet = new Diet();
//        diet.setName_of_diet(" Buckwheat diet ");
//        diet.setTime_of_diet(7);
//
//        DietService.saveDiet();
//        System.out.println(user.toString());

//        Product product = new Product();
//        product.setDiet(diet);
//        product.setBreakfast("каша");
//        product.setDinner("суп");
        //product.setSupper("мясо");
//
//        Product dbProduct = service.add(product);
//
//        System.out.println(dbproduct);
    }


}
