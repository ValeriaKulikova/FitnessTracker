package servise;

import dal.ProductDao;
import dao.Product;
import dao.Diet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServise {

    @Autowired
    private ProductDao productDao;
    public void saveNewProduct(Product product, Diet diet){

    }

}
