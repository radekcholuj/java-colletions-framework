package pl.radekcholuj.documentsrepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepository {
    private List<Document> documents = new ArrayList<>();

    void add(Document document) {
        documents.add(document);
    }

    Document getById(int id) {
        return documents.get(id);
    }
}