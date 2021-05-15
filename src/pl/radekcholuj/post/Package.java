package pl.radekcholuj.post;

import java.util.Objects;

public class Package {

    private String size;
    private int weight;
    private Priority priority;

    public Package(String size, int weight, Priority priority) {
        this.size = size;
        this.weight = weight;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Package{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return priority == aPackage.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }
}

