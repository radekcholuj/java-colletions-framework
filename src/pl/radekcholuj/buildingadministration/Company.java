package pl.radekcholuj.buildingadministration;

public class Company {

    private String companyName;
    private String phoneNumber;

    public Company(String companyName, String phoneNumber) {
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}