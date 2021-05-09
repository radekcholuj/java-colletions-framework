package pl.radekcholuj.buildingadministration;

public class Office {

    private int officeNumber;
    private int stage;
    private Company company;

    public Office(int officeNumber, int stage, Company company) {
        this.officeNumber = officeNumber;
        this.stage = stage;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeNumber=" + officeNumber +
                ", stage=" + stage +
                ", company=" + company +
                '}';
    }
}
