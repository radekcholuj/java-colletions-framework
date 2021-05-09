package pl.radekcholuj.buildingadministration;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class AdministrationApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int option;

        do {
            System.out.println("----- Administration -----");
            System.out.println("1 - add office");
            System.out.println("2 - check office");
            System.out.println("3 - display all offices");
            System.out.println("4 - edit office");
            System.out.println("5 - remove office");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (option != 0);
    }
}
