package pl.radekcholuj.shopqueue;

public class Person implements Comparable<Person>{
    private String name;
    private Status status;

    public Person(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Person person2) {
        return status.compareTo(person2.status);
    }
}