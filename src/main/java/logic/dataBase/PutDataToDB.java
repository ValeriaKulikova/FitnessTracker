package logic.dataBase;

import dal.DietDao;
import dal.ProductDao;
import dao.Diet;
import dao.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PutDataToDB {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        DietDao dietDao = context.getBean(DietDao.class);
        ProductDao productDao =context.getBean(ProductDao.class);



        Diet newDiet1 = new Diet();
        newDiet1.setNameOfDiet(" Diet for a week ");
        newDiet1.setTimeOfDiet(7);

        Product newProduct1 = new Product();
        newProduct1.setDiet(newDiet1);
        newProduct1.setBreakfast("Kefir,fruit,water");
        newProduct1.setDinner("Potato,Chicken,meat,fish,water");
        newProduct1.setSupper("Kefir,fruit,water");

        dietDao.save(newDiet1);
        productDao.save(newProduct1);

        System.out.println("Diet:" + newDiet1.toString());


        Diet newDiet2 = new Diet();
        newDiet2.setNameOfDiet("Buckwheat diet ");
        newDiet2.setTimeOfDiet(7);

        Product newProduct2 = new Product();
        newProduct2.setDiet(newDiet2);
        newProduct2.setBreakfast("Buckwheat,water");
        newProduct2.setDinner("Buckwheat,water");
        newProduct2.setSupper("Buckwheat,water");


        dietDao.save(newDiet2);
        productDao.save(newProduct2);

        System.out.println("Diet:" + newDiet2.toString());

        Diet newDiet3 = new Diet();
        newDiet3.setNameOfDiet("Protein diet ");
        newDiet3.setTimeOfDiet(14);

        Product newProduct3 = new Product();
        newProduct3.setDiet(newDiet3);
        newProduct3.setBreakfast("Egg,vegetables,fruits,tea");
        newProduct3.setDinner("Chicken,rice,soup,water");
        newProduct3.setSupper("Cottage cheese,fish,kefir,vegetables,water");


        dietDao.save(newDiet3);
        productDao.save(newProduct3);

        System.out.println("Diet:" + newDiet3.toString());

        Diet newDiet4 = new Diet();
        newDiet4.setNameOfDiet("Japanese diet ");
        newDiet4.setTimeOfDiet(7);

        Product newProduct4 = new Product();
        newProduct4.setDiet(newDiet4);
        newProduct4.setBreakfast("Cofee,tea");
        newProduct4.setDinner("Egg,cabbage salad,fish,vegetables,water");
        newProduct4.setSupper("Meat,fish,egg,vegetables,apple,water");

        dietDao.save(newDiet4);
        productDao.save(newProduct4);

        System.out.println("Diet:" + newDiet4.toString());


        Diet newDiet5 = new Diet();
        newDiet5.setNameOfDiet("Hollywood diet ");
        newDiet5.setTimeOfDiet(7);

        Product newProduct5 = new Product();
        newProduct5.setDiet(newDiet5);
        newProduct5.setBreakfast("Cofee,vegetables,tea");
        newProduct5.setDinner("Egg,fruts,vegetables,water");
        newProduct5.setSupper("Egg,beef,vegetables,fruts,tea,water");


        dietDao.save(newDiet5);
        productDao.save(newProduct5);

        System.out.println("Diet:" + newDiet5.toString());


    }
}
