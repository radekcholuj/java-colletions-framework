package pl.radekcholuj.battleship;

import java.util.Scanner;

public class BattleshipApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShootsRepo repo = new ShootsRepo();
        int option;

        do {
            System.out.println("----- Battleship App -----");
            System.out.println("1 - shoot");
            System.out.println("2 - shoots history");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("X: ");
                    String x = scanner.nextLine();
                    System.out.print("Y: ");
                    String y = scanner.nextLine();

                    Shoot shoot = new Shoot(x, y);
                    repo.add(shoot);

                    break;
                case 2:
                    System.out.println(repo);

                    break;
                case 0:

                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}

