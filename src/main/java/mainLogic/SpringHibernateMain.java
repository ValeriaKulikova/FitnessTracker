package mainLogic;

import dal.ProductDao;
import dal.DietDao;
import dao.Product;
import dao.Diet;
import interfaseData.NameOfDietPageData;
import interfaseData.ProductPageData;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import java.util.ArrayList;
import java.util.List;



public class SpringHibernateMain {
    public static void main (String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        DietDao dietDao = context.getBean(DietDao.class);
        ProductDao productDao =context.getBean(ProductDao.class);

        //        putNewRecordsToDataBase(dietDao, productDao);


//        Minimum functionality

//        1. Open main page
        List<NameOfDietPageData> nameOfDietPageData=openMainPage(dietDao,productDao);
        System.out.println("\n\n" + "1. Open main page");
        for (NameOfDietPageData t : nameOfDietPageData){

            System.out.println(t.toString());
        }

// 2.Product list for period???????????????????????????????


        // 3. Show all diets

             List<String> dietNames = getAllDietNames(dietDao);
             System.out.println("Question1!!!!!!!!!!!!!");

        for (String name : dietNames){
            System.out.println("diet (nameDiet="+ name + " ) ");
        }

        //4. Show diet information

        String nameOfDiet = "Diet for a week";
        String timeOfDiet = "7";
        Diet diet = findDietInfo(dietDao,nameOfDiet,timeOfDiet);

        System.out.println("\n\n" + "4.Show diet information");
        System.out.println("diet" + diet);


        //5. Show diets by time
        List<Diet> dietsByTime = showDietsForTime(dietDao, 7);

        System.out.println("Question2!!!!!!!!!");
        
        for (Diet dieta : dietsByTime) {
            System.out.println("diet(dietsForTime=" + dieta + ") ");
        }

        
         context.close();
    }

    //        1. Open main page
    private static List<NameOfDietPageData> openMainPage(DietDao dietDao,ProductDao productDao) {
    List<Diet> dietList=dietDao.findAll();
    List<NameOfDietPageData> nameOfDietPageData= mapToNameOfDietPageData(dietList, productDao);

    return nameOfDietPageData;

    }

    private static List<NameOfDietPageData> mapToNameOfDietPageData(List<Diet> dietList, ProductDao productDao) {
    List<NameOfDietPageData> dataList=new ArrayList<NameOfDietPageData>();

    for (Diet diet: dietList) {
        NameOfDietPageData data = new NameOfDietPageData();

        // LocalDateTime dateTime  = diet.getDateTime();

        Long dietId= diet.getDietId();
        Diet diet= dietDao.findById(dietId);
        String nameOfDiet = diet.getNameOfDiet() + " " + diet.getTimeOfDiet();
        data.setNameOfDiet(nameOfDiet);

        String nameOfDiet = diet.getNameOfDiet();
        data.setNameOfDiet(nameOfDiet);

        dataList.add(data);
    }
        return dataList;
    }



    // 3. Show all diets
    private static List<String> getAllDietNames(DietDao dietDao) {
        List<String> resultNames = new ArrayList<String>();

        List<Diet> dietList = dietDao.findAll();

        for (Diet diet : dietList){
            String name = diet.getNameOfDiet();
            resultNames.add(name);
        }

        return resultNames;
    }

    //4. Show diet information
    private static Diet findDietInfo(DietDao dietDao, String nameOfDiet, String timeOfDiet) {
Diet diet = dietDao.findByNameOfDietAndTimeOfDiet(nameOfDiet,timeOfDiet);
return diet;

    }


    //5. Show diets by time
    private static List<Diet> showDietsForTime(DietDao dietDao, int time) {
        List<Diet> resultList= dietDao.findByTime(time);

        for (Diet diet : resultList){
            int times = diet.getTimeOfDiet();
            resultList.add(times);

        }

        return resultList;

    }




}
