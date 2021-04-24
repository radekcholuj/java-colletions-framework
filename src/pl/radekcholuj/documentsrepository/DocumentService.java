package pl.radekcholuj.documentsrepository;

import java.util.List;
import java.util.Scanner;

public class DocumentService {
    public Scanner scanner = new Scanner(System.in, "UTF-8");
    private DocumentRepository documentRepository = new DocumentRepository();

    List<Document> getDocuments() {
        return documentRepository.getAll();
    }

    void containsDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Document document = new Document(name);
        boolean exists = documentRepository.contains(document);

        if (exists) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists.");
        }
    }

    void deleteDocument() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        documentRepository.removeById(id);
    }

    void updateDocument() {
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

    int updateDocumentMenu() {
        System.out.println("1 - edit name");
        System.out.println("2 - edit content");
        int option = scanner.nextInt();
        scanner.nextLine(); // new line

        return option;
    }

    Document getDocumentById() {
        System.out.print("ID: ");
        int id = scanner.nextInt();

        return documentRepository.getById(id);
    }

    void addDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Content: ");
        String content = scanner.nextLine();

        Document document = new Document(name, content);
        documentRepository.add(document);
    }

    int menu() {
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
