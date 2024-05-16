package entity;

import entity.enums.UserStatus;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The User class represents a user in the system.
 * It contains the user's first name, last name, and birth date,
 * as well as the department the user belongs to.
 */
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private Department department;

    private UserStatus userStatus;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userStatus = UserStatus.NOT_CONFIRMED;
    }

    public User(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName);
        this.birthDate = birthDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Sets the department for the user.
     *
     * @param department the Department object representing the user's department
     */
    protected void setUserDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(birthDate, user.birthDate) && Objects.equals(department, user.department) && userStatus == user.userStatus;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(birthDate);
        result = 31 * result + Objects.hashCode(department);
        result = 31 * result + Objects.hashCode(userStatus);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department +
                ", userStatus=" + userStatus +
                '}';
    }
}
