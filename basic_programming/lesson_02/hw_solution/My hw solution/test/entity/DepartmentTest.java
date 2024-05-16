package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * The entity.DepartmentTest class contains tests for the Department class.
 */
public class DepartmentTest {

    /**
     * Test to check if an employee is successfully added to the department.
     */
    @Test
    public void testAddEmployeeSuccess() {
        Department department = new Department("Development");
        User user = new User("Test", "User", LocalDate.of(1990, 1, 1));

        boolean isEmployeeAdded = department.addEmployee(user);

        Assertions.assertTrue(isEmployeeAdded, "Employee should have been successfully added.");
        Assertions.assertEquals(department, user.getDepartment(), "Employee's department should be set to the given department after being added.");
        Assertions.assertTrue(department.getDepartmentEmployees().contains(user), "Department's employees should contain the added employee.");
    }

    /**
     * Test to check if an employee fails to be added to the department when they are already in the department.
     */
    @Test
    public void testAddEmployeeFailure() {
        Department department = new Department("Development");
        User user = new User("Test", "User", LocalDate.of(1990, 1, 1));
        department.addEmployee(user);

        boolean secondAdditionResult = department.addEmployee(user);

        Assertions.assertFalse(secondAdditionResult, "Second attempt to add the same employee should return false.");
        Assertions.assertEquals(1, department.getDepartmentEmployees().size(), "Department's employees should only contain the added employee once.");
    }
}
