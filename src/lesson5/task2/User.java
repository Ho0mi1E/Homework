package lesson5.task2;



public class User  {
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private int salary;

    public User(String firstName, String lastName, String email, Role role, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role.getRole() + '\'' +
                ", salary= " + salary / 100 + " рублей " + salary % 100 + " копеек" + "}";
    }

}
