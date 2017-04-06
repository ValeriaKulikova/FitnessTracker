package mainLogic;

import dal.ProductDao;
import dal.DietDao;
import dao.Product;
import dao.Diet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class SpringHibernateMain {
    public static void main (String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        DietDao dietDao = context.getBean(DietDao.class);
        ProductDao productDao =context.getBean(ProductDao.class);

        Diet newDiet = new Diet();
        newDiet.setNameOfDiet(" Diet for a week ");
        newDiet.setTimeOfDiet(7);

        Product newProduct = new Product();
        newProduct.setDiet(newDiet);
        newProduct.setBreakfast("Kefir,fruit,water");
        newProduct.setDinner("Potato,Chicken,meat,fish,water");
        newProduct.setSupper("Kefir,fruit,water");


        dietDao.save(newDiet);
        productDao.save(newProduct);

        System.out.println("Diet::" + newDiet.toString());
        List<Diet> dietList = dietDao.findAll();
         for (Diet diet : dietList){
             System.out.println("Diet List::" + diet);
         }
         context.close();
    }
}
