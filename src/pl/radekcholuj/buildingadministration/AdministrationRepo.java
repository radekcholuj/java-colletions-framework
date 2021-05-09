package pl.radekcholuj.buildingadministration;

import java.util.*;

public class AdministrationRepo {

    private List<Office> offices = new ArrayList<>();

    public void add(Office office) {
        if (!(offices.contains(office))) {
            offices.add(office);
            System.out.println("Company added on stage " + office.getStage() + ", in office no. " + office.getOfficeNumber());
        } else {
            System.out.println("This office is occupied. Please choose another stage or office.");
        }
    }

    public void remove(Office officeByCompanyName) {
        offices.remove(officeByCompanyName);
    }

    public void displayAll() {
        System.out.println(offices);
    }

    public Office getByCompanyName(String companyName) {
        Office gotOffice = null;
        for (int i = 0; i < offices.size(); i++) {
            if (offices.get(i).getCompany().getCompanyName().equals(companyName)) {
                gotOffice = offices.get(i);
            }
        }
        return gotOffice;
    }
}
