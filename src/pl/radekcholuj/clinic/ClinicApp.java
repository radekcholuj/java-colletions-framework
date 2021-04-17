package pl.radekcholuj.clinic;

import pl.radekcholuj.importfromfile.Person;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ClinicApp {
    private final static int STOP = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Person> people = new LinkedHashSet<>();
        int option;
        do {
            System.out.println("------------ CLINIC ------------");
            System.out.println("1 - register");
            System.out.println("2 - display all");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    if (people.size() < 10) {
                        System.out.println("Name: ");
                        String name = scanner.nextLine();

                        System.out.println("Surname: ");
                        String surname = scanner.nextLine();

                        System.out.println("Pesel: ");
                        String pesel = scanner.nextLine();

                        Person person = new Person(name, surname, pesel);
                        people.add(person);
                    }else{
                        System.out.println("No places");
                    }

                    break;
                case 2:
                    System.out.println(people);
                    break;
            }
        } while (option != STOP);
    }
}
