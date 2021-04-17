package pl.radekcholuj.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    private static final int MIN = 1;
    private static final int MAX = 49;

    public static Set<Integer> run(){
        Set<Integer> numbers = new HashSet<>();
        do {
            int number = getNextNumber();
            numbers.add(number);
        } while(numbers.size() < 6);

        return numbers;
    }

    private static int getNextNumber() {
        Random random = new Random();
        return random.nextInt(MAX - MIN) + MIN;
    }
}