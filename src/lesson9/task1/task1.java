package lesson9.task1;


import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Person2000> listOfPerson = new ArrayList<>();
        Person2000 first = new Person2000(1,"КЕК", 12);
        Person2000 first1 = new Person2000(2,"лол", 12);
        Person2000 first2 = new Person2000(3,"f", 12);
        Person2000 first3 = new Person2000(4,"a", 12);
        Person2000 first6 = new Person2000(5,"c", 12);
        Person2000 first4 = new Person2000(6,"k", 12);
        listOfPerson.add(first);
        listOfPerson.add(first1);
        listOfPerson.add(first2);
        listOfPerson.add(first3);
        listOfPerson.add(first4);
        listOfPerson.add(first6);
        System.out.println(listOfPerson.contains(first));

        for (Person2000 o: listOfPerson) {
            System.out.println(o.getName());

        }
        listOfPerson.remove(1);
        System.out.println(listOfPerson.get(0).getName());

        List<Person2000> list2 = new ArrayList<>(listOfPerson);


    }
}
