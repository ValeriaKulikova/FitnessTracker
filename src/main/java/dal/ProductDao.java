package dal;

import dao.Product;

import java.util.List;

public interface ProductDao {
    void save(Product entity);

    List<Product> findAll();

    Product findById(Long productId);

}
