package pl.radekcholuj.carcolletion;

import java.util.*;

public class CarApp {
    public static void main(String[] args) {

        Set<Car> cars = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("----- Car Collection -----");
            System.out.println("1 - add car");
            System.out.println("2 - display all cars");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Car car = parametersOfCar(scanner);
                    cars.add(car);
                    break;
                case 2:
                    System.out.println(cars);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static Car parametersOfCar(Scanner scanner) {
        System.out.println("--- Car 1 ---");
        System.out.print("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel consuming: ");
        double fuelConsuming = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Engine capacity: ");
        double engineCapacity = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        return new Car(price,fuelConsuming,engineCapacity);
    }
}
