package dao;
import model.Product;
import java.util.*;

public class ProductDAO {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Laptop", 45000, "High-performance Laptop"));
        productList.add(new Product(2, "Smartphone", 25000, "Latest Android Phone"));
        productList.add(new Product(3, "Headphones", 2000, "Wireless Noise Cancelling Headphones"));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(int id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
