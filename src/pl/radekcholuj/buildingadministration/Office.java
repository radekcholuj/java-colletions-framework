package pl.radekcholuj.buildingadministration;

import java.util.Objects;

public class Office {

    private int stage;
    private int officeNumber;
    private Company company;

    public Office(int stage, int officeNumber, Company company) {
        this.stage = stage;
        this.officeNumber = officeNumber;
        this.company = company;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setOfficeNumber(int officeNumber) {

        this.officeNumber = officeNumber;
    }

    public Company getCompany() {
        return company;
    }

    public int getStage() {
        return stage;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String toString() {
        return "\n"+"Stage: " + stage + "\n" + "Office no.: " + officeNumber + "\n" + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return stage == office.stage && officeNumber == office.officeNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stage, officeNumber);
    }
}
