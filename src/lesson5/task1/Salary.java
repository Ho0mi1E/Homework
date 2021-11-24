package lesson5.task1;


public class Salary {

    public EmployeeType employeeType;

    public Salary(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void mySalary(int days){
        switch (employeeType){
            case DIRECTOR:
                System.out.println("Ваша зарплата " + employeeType.DIRECTOR_ * days + " $");
                break;
            case TRAINEE:
                System.out.println("Ваша зарплата " + employeeType.TRAINEE_ * days + " $");
                break;
            case ENGENEER:
                System.out.println("Ваша зарплата " + employeeType.ENGENEER_ * days + " $");
                break;
            case DEPARTMENT_HEAD:
                System.out.println("Ваша зарплата " + employeeType.DEPARTMENT_HEAD_ * days + " $");
                break;


        }
    }
}
