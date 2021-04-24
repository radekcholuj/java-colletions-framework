package pl.radekcholuj.documentsrepository;

import java.util.List;
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
                    System.out.println(getDocumentById());
                    break;
                case 22:
                    System.out.println(getDocuments());
                    break;
                case 3:
                    updateDocument();
                    break;
                case 4:
                    deleteDocument();
                    break;
                case 5:
                    containsDocument();
                    break;
            }
        } while (option != -1);

        scanner.close();
    }

    private static void updateDocument() {
        Document document = getDocumentById();
        System.out.println(document);
        int option = updateDocumentMenu();
        switch (option) {
            case 1:
                System.out.print("Name: ");
                String name = scanner.nextLine();
                document.setName(name);
                break;
            case 2:
                System.out.print("Content: ");
                String content = scanner.nextLine();
                document.setContent(content);
                break;
        }
    }
    private static List<Document> getDocuments() {
        return documentRepository.getAll();
    }

    private static void containsDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Document document = new Document(name);
        boolean exists = documentRepository.contains(document);

        if(exists){
            System.out.println("Exists");
        } else {
            System.out.println("Not exists.");
        }
    }

    private static void deleteDocument() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        documentRepository.removeById(id);
    }

    private static int updateDocumentMenu() {
        System.out.println("1 - edit name");
        System.out.println("2 - edit content");
        int option = scanner.nextInt();
        scanner.nextLine(); // new line

        return option;
    }

    private static Document getDocumentById() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.println(documentRepository.getById(id));
        return documentRepository.getById(id);
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
        System.out.println("22 - getAll");
        System.out.println("3 - update");
        System.out.println("4 - delete");
        System.out.println("5 - contains");
        System.out.println("-1 - stop");
        int option = scanner.nextInt();
        scanner.nextLine(); // przechwycenie nowej lini
        return option;
    }
}
