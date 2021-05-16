package pl.radekcholuj.castorama;

import java.util.Scanner;

public class CastoramaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        int option;
        do {
            System.out.println("----------- castorama -----------");
            System.out.println("1 - add order");
            System.out.println("2 - prepare order");


            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Product name: ");
                    String product = scanner.nextLine();
                    shop.addOrder(product);
                    break;
                case 2:
                    System.out.println(shop.getOrder());
                    break;
            }
        } while (option != -1);
    }
}

