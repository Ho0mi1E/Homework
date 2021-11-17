package lesson4.task6;

public class check {
    public static void main(String[] args) {
        Person lector1 = new Lector("Владимир", "Путин", 45, 10000);
        Person student1 = new Student("Боб", "Строитель", 10);
        Person student2 = new Student("OG", "Lok", 26);
        Person lector2 = new Lector("Carl", "Johnson", 39, 100);

        Person[] persons = {student1, lector1, student2, lector2};
        StudyMethod personMethod = new StudyMethod(persons);

        personMethod.oldFart();
        personMethod.oldMan();
        personMethod.pickOne(3);
        personMethod.onlyStudent();

    }
}
