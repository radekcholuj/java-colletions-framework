package pl.radekcholuj.shoppingcart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Shop {
    private Map<Product, Integer> shoppingCart = new HashMap<>();

    public void add(Product product, int count) {
        shoppingCart.put(product, count);
    }

    public double calculate() {
        double sum = 0;
        Iterator<Map.Entry<Product, Integer>> iterator = shoppingCart.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Product, Integer> entry = iterator.next();
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }
}
