package pl.radekcholuj.webinar;

import java.util.Scanner;

public class WebinarApp {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Webinar theBestWebinar = null;

        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println(theBestWebinar);
                    break;
                case 2:
                    Webinar webinar = inputDataWebinar();
//                    theBestWebinar = setTheBestWebinarByComparator(theBestWebinar, webinar);
                    theBestWebinar = setTheBestWebinarByComparable(theBestWebinar, webinar);
                    break;
            }
        } while (option != -1);
        scanner.close();
    }

    private static Webinar setTheBestWebinarByComparable(Webinar theBestWebinar, Webinar webinar) {
        if (theBestWebinar == null || theBestWebinar.compareTo(webinar) > 0) {
            theBestWebinar = webinar;
        }
        return theBestWebinar;
    }

    private static Webinar setTheBestWebinarByComparator(Webinar theBestWebinar, Webinar webinar) {
        WebinarComparator webinarComparator = new WebinarComparator();
        if (webinarComparator.compare(theBestWebinar, webinar) > 0) {
            theBestWebinar = webinar;
        }
        return theBestWebinar;
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
        System.out.println("1 - display the best webinar");
        System.out.println("2 - add webinar");
        System.out.println("-1 - stop");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }
}