package pl.radekcholuj.shopqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ShopQueue {
    private Queue<Person> people = new PriorityQueue<>();

    public boolean add(Person person){
        return people.offer(person);
    }

    public Person get(){
        return people.poll();
    }
}