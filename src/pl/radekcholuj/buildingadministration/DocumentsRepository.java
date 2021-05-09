package pl.radekcholuj.buildingadministration;

import pl.radekcholuj.documentsrepository.Document;

import java.util.*;

public class DocumentsRepository {

    private List<Document> documents = new ArrayList<>();

    void add(Document document) {
        documents.add(document);
    }

    Document getById(int id) {
        return documents.get(id - 1);
    }

    public void removeById(int id) {
        documents.remove(id);
    }

    public boolean contains(Document document) {
        return documents.contains(document);
    }

    public List<Document> readAll() {
        return documents;
    }
}
