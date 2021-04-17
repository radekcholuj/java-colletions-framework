package pl.radekcholuj.importfromfile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ImportFromFileApp {
    public static void main(String[] args) {
        File file = new File();
        Set<Person> people = new HashSet<>(Arrays.asList(file.getPeople()););
        System.out.println(people);
    }
}
