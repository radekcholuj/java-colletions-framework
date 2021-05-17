package pl.radekcholuj.dictionary;

import java.util.Scanner;

public class DictionaryUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int option;
        String pl, ang;

        do{
            System.out.println("1 - add word");
            System.out.println("2 - translate");
            System.out.println("3 - all");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 :
                    System.out.print("POL: ");
                    pl = scanner.nextLine();
                    System.out.print("ANG: ");
                    ang = scanner.nextLine();
                    dictionary.add(pl, ang);
                    break;
                case 2:
                    System.out.print("POL: ");
                    pl = scanner.nextLine();
                    System.out.println("ANG: "+dictionary.polToAng(pl));
                    break;
                case 3:
                    dictionary.displayAll();
                    break;
            }
        } while(option != -1);
    }
}
