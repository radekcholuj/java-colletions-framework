package pl.radekcholuj.shopqueue;

import java.util.Scanner;

public class ShopQueueApp {
    public static void main(String[] args) {
        ShopQueue shopQueue = new ShopQueue();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("------- Shop Queue --------");
            System.out.println("1 - add");
            System.out.println("2 - get");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Status -> ");
                    System.out.println("1 - disabled");
                    System.out.println("2 - pregnant");
                    System.out.println("3 - default");
                    option = scanner.nextInt();
                    scanner.nextLine();
                    Status status = Status.DEFAULT;
                    switch (option) {
                        case 1:
                            status = Status.DISABLED;
                            break;
                        case 2:
                            status = Status.PREGNANT;
                            break;
                    }
                    Person person = new Person(name, status);
                    shopQueue.add(person);
                    break;
                case 2:
                    person = shopQueue.get();
                    System.out.println(person);
                    break;
            }
        } while(option != -1);
    }
}
