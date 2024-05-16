package entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The Department class represents a department within a company.
 * It contains a department name and a set of employees in the department.
 */
public class Department {

    private String departmentName;
    private final Set<User> departmentEmployees = new HashSet<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Adds an employee to the department.
     *
     * @param employee the User object representing the employee to be added
     * @return true if the employee was successfully added, false otherwise
     */
    public boolean addEmployee(User employee) {
        boolean isEmployeeAdded = departmentEmployees.add(employee);
        if (isEmployeeAdded) {
            employee.setUserDepartment(this);
        }
        return isEmployeeAdded;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void changeDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<User> getDepartmentEmployees() {
        return departmentEmployees;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;

        return Objects.equals(departmentName, that.departmentName) && departmentEmployees.equals(that.departmentEmployees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(departmentName);
        result = 31 * result + departmentEmployees.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentEmployees=" + departmentEmployees +
                '}';
    }
}
