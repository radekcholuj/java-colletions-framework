package pl.radekcholuj.documentsrepository;

import java.util.Scanner;

public class DocumentsRepositoryApp {
    private static Scanner scanner = new Scanner(System.in, "UTF-8");
    private static DocumentRepository documentRepository = new DocumentRepository();

    public static void main(String[] args) {
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    addDocument();
                    break;
                case 2:
                    getDocumentById();
                    break;
                case 3:
                    System.out.println("update");
                    break;
                case 4:
                    System.out.println("delete");
                    break;
            }
        } while (option != -1);

        scanner.close();
    }

    private static void getDocumentById() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.println(documentRepository.getById(id));
    }

    private static void addDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Content: ");
        String content = scanner.nextLine();

        Document document = new Document(name, content);
        documentRepository.add(document);
    }

    private static int menu() {
        System.out.println("-------- Documents Repository -------");
        System.out.println("1 - add");
        System.out.println("2 - get");
        System.out.println("3 - update");
        System.out.println("4 - delete");
        System.out.println("-1 - stop");
        int option = scanner.nextInt();
        scanner.nextLine(); // przechwycenie nowej lini
        return option;
    }
}
