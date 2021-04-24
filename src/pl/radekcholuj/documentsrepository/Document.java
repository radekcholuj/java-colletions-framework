package pl.radekcholuj.documentsrepository;

import java.util.Objects;

public class Document {
    private String name;
    private String content;

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Document(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(name, document.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
