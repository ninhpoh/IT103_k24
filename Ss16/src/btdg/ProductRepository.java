package btdg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductRepository implements IRepositoryry {
    ArrayList<Product> products = new ArrayList<>();
    HashMap<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Object item) {
        if (item instanceof Product) {
            Product product = (Product) item;
            if (productMap.containsKey(product.getId())) {
                return false;
            }
            products.add(product);
            productMap.put(product.getId(), product);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeById(String id) {
        if (productMap.containsKey(id)) {
            Product product = productMap.get(id);
            products.remove(product);
            productMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public Product[] findAll() {
        return products.toArray(new Product[0]);
    }
}
