package lesson4.task5;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("alex","dsd", "3123123");
        Person person2 = new Person("blea","dsddsda", "31233443");

        new NotifierHandler().NotifierAll(new Person[] {person1,person2});

    }
}
