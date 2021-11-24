package OOP.task2;

public abstract class Employee {
    private String name;
    private String lastName;
    private int age;
    private EmployeeType employeeType;


    public Employee(String name, String lastName, int age, EmployeeType employeeType) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.employeeType = employeeType;

    }



}
