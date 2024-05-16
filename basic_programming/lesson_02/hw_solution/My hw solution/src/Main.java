import entity.Company;
import entity.Department;
import entity.User;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        // Create a new user
        User user = new User("John", "Doe", LocalDate.of(2000, 6, 17));

        // Create a new company
        Company company = new Company("AIT-TR GmbH", "Linkedstr 8");

        // Create a new department and assign it to the company
        Department department = new Department("Teacher");
        company.addDepartment(department);

        // Add the user as an employee to the department
        department.addEmployee(user);

        // Print details of the company, department and user
        System.out.println(company);
        System.out.println();
        System.out.println(department);
        System.out.println();
        System.out.println(user);
    }
}
