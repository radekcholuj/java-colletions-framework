package pl.radekcholuj.webinarcollection;

import java.util.Scanner;
import java.util.TreeSet;

public class WebinarApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<Webinar> webinars = new TreeSet<>();

        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println(webinars);
                    break;
                case 2:
                    Webinar webinar = inputDataWebinar();
                    webinars.add(webinar);
                    break;
            }
        } while (option != -1);

        scanner.close();
    }

    private static Webinar inputDataWebinar() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Signed up: ");
        int signedUp = scanner.nextInt();

        System.out.print("Present: ");
        int present = scanner.nextInt();

        Webinar webinar = new Webinar(title, signedUp, present);

        return webinar;
    }

    private static int menu() {
        System.out.println("----- The best webinar -------");
        System.out.println("1 - display all");
        System.out.println("2 - add webinar");
        System.out.println("-1 - stop");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }
}