package pl.radekcholuj.buildingadministration;

public class Company {

    private String companyName;
    private String phoneNumber;

    public Company(String companyName, String phoneNumber) {
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Company name: " + companyName + "\n" + "Phone number: " + phoneNumber +"\n";
    }
}