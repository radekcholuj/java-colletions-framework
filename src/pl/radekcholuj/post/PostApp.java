package pl.radekcholuj.post;

import java.util.*;

public class PostApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PackageWarehouse packageWarehouse = new PackageWarehouse();
        int option;

        do {
            System.out.println("----- Post Office -----");
            System.out.println("1 - add package to warehouse");
            System.out.println("2 - pick up package");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Size (S, M, L, XL): ");
                    String size = scanner.nextLine();
                    System.out.print("Weight: ");
                    int weight = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Priority: ");
                    System.out.println("1 - PRIORITY");
                    System.out.println("2 - REGISTERED");
                    System.out.println("3 - PLAIN");
                    Priority priority = Priority.PLAIN;
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            priority = Priority.PRIORITY;
                            break;
                        case 2:
                            priority = Priority.REGISTERED;
                            break;
                        case 3:
                            priority = Priority.PLAIN;
                            break;
                    }

                    Package p = new Package(size, weight, priority);
                    System.out.println(packageWarehouse.add(p));

                    break;
                case 2:
                    try {
                        packageWarehouse.pickUp();
                    } catch (NoSuchElementException e) {
                        System.out.println("Warehouse is empty.");
                    }
                    break;
            }

        } while (option != 0);
        scanner.close();
    }
}