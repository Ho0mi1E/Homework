package lesson4.task6;

public class Lector extends Person{

    private int workingYears;



    public Lector(String firstName, String lastName, int age, int workingYears ) {
        super(firstName, lastName, age);
        this.workingYears = workingYears;

    }

    public int getWorkingYears() {
        return workingYears;
    }
}
