package pl.radekcholuj.shoppingcart1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Shop {
    private Map<Product, Integer> shoppingCart = new LinkedHashMap<>();

    public void add(Product product, int count){
        shoppingCart.put(product, count);
    }

    public double calculate(){
        double sum = 0;
        var iterator= shoppingCart.entrySet().iterator();

        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey().getName());
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }
}