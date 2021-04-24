package pl.radekcholuj.documentsrepository;


public class DocumentsRepositoryApp {
    private static DocumentService documentService = new DocumentService();

    public static void main(String[] args) {
        int option;
        do {
            option = documentService.menu();
            switch (option) {
                case 1:
                    documentService.addDocument();
                    break;
                case 2:
                    System.out.println(documentService.getDocumentById());
                    break;
                case 22:
                    System.out.println(documentService.getDocuments());
                    break;
                case 3:
                    documentService.updateDocument();
                    break;
                case 4:
                    documentService.deleteDocument();
                    break;
                case 5:
                    documentService.containsDocument();
                    break;
            }
        } while (option != -1);

        documentService.scanner.close();
    }
}
