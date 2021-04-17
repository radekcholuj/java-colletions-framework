package pl.radekcholuj.importfromfile;

public class File {
    private Person[] people = new Person[7];

    public File() {
        prepareData();
    }

    private void prepareData() {
        people[0] = new Person("Marek", "Jankowski", "88112200873");
        people[1] = new Person("Jarek", "Kowalski", "87112200873");
        people[2] = new Person("Anna", "Nowak", "41112200873");
        people[3] = new Person("Jarek", "Kowalski", "87112200873");
        people[4] = new Person("Julia", "Nowak", "86112200873");
        people[5] = new Person("Kasia", "Kowalski", "85112200873");
        people[6] = new Person("Filip", "Kowalski", "83112200873");
    }

    public Person[] getPeople() {
        return people;
    }
}
