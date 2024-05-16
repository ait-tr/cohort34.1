package entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The Company class represents a company with a name and address.
 * It contains a set of departments in the company.
 */
public class Company {


    private String companyName;
    private String companyAddress;
    private final Set<Department> departments = new HashSet<>();

    public Company(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public boolean addDepartment(Department department) {
        return this.departments.add(department);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;

        return Objects.equals(companyName, company.companyName) && Objects.equals(companyAddress, company.companyAddress) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(companyName);
        result = 31 * result + Objects.hashCode(companyAddress);
        result = 31 * result + Objects.hashCode(departments);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", departments=" + departments +
                '}';
    }

}

