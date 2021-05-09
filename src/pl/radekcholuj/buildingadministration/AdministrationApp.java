package pl.radekcholuj.buildingadministration;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class AdministrationApp {
    private static Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private static AdministrationRepo administrationRepo = new AdministrationRepo();

    public static void main(String[] args) {

        Office office;
        int option;

        do {
            option = mainMenu();

            switch (option) {
                case 1:
                    addNewOffice();
                    break;
                case 2:
                    readOfficeByCompanyName();
                    break;
                case 3:
                    administrationRepo.displayAll();
                    break;
                case 4:
                    editOfficeData();
                    break;
                case 5:
                    administrationRepo.remove(getOfficeByCompanyName());
                    break;
            }
        } while (option != 0);
    }

    private static int mainMenu() {
        int option;
        System.out.println("----- Administration -----");
        System.out.println("1 - add office");
        System.out.println("2 - check office");
        System.out.println("3 - display all offices");
        System.out.println("4 - edit office");
        System.out.println("5 - remove office");
        System.out.println("0 - quit");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void addNewOffice() {
        System.out.print("Stage: ");
        int stage = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Office no.: ");
        int officeNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Company phone no.: ");
        String phoneNumber = scanner.nextLine();

        Company company = new Company(companyName, phoneNumber);
        Office office = new Office(stage, officeNumber, company);
        administrationRepo.add(office);
    }

    private static Office getOfficeByCompanyName() {
        System.out.print("Company name: ");
        String companyName = scanner.nextLine();

        return administrationRepo.getByCompanyName(companyName);
    }


    private static void readOfficeByCompanyName() {
        Office office = getOfficeByCompanyName();
        if(office != null){
            System.out.println("Yes.");
            System.out.println(office);
        } else {
            System.out.println("No.");
        }
    }

    private static void editOfficeData() {
        Office office;
        int option;
        do {
            System.out.println("What you want to change?");
            System.out.println("1 - stage");
            System.out.println("2 - office number");
            System.out.println("3 - company name");
            System.out.println("4 - company phone number");
            System.out.println("9 - finish and back to main menu");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    office = getOfficeByCompanyName();
                    System.out.print("New stage: ");
                    int newStage = scanner.nextInt();
                    scanner.nextLine();
                    office.setStage(newStage);
                    break;
                case 2:
                    office = getOfficeByCompanyName();
                    System.out.print("New office number: ");
                    int newOfficeNumber = scanner.nextInt();
                    scanner.nextLine();
                    office.setOfficeNumber(newOfficeNumber);
                    break;
                case 3:
                    office = getOfficeByCompanyName();
                    System.out.print("New company name: ");
                    String newCompanyName = scanner.nextLine();
                    office.getCompany().setCompanyName(newCompanyName);
                    break;
                case 4:
                    office = getOfficeByCompanyName();
                    System.out.print("New phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    office.getCompany().setPhoneNumber(newPhoneNumber);
                    break;
            }
        } while (option != 9);
    }
}