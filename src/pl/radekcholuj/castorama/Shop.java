package pl.radekcholuj.castorama;

import java.util.ArrayDeque;
import java.util.Queue;

public class Shop {

    Queue<String> orders = new ArrayDeque<>();

    public void addOrder(String product) {
        orders.offer(product);
    }

    public String getOrder() {
        return orders.poll();
    }
}

