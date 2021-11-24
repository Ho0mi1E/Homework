package lesson5.task2;

import static lesson5.task2.Role.DIRECTOR;
import static lesson5.task2.Role.EMPLOYEE;

public class check {
    public static void main(String[] args) {
        User user = new User("1","d","d",EMPLOYEE, 111);
        System.out.println(user.toString());
        InmemoryStore ga = new InmemoryStore();
        ga.getUser("aaaa");


    }
}
