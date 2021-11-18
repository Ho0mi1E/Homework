package lesson4.task4;

public abstract class Animal {
    String name;
    String owner;
    int age;
    public Animal (String name, String owner, int age){
        this.name = name;
        this.owner = owner;
        this.age = age;
    }
    public void say(){
        System.out.println("гав гав");

    }
    public void info(){
        System.out.println(name);
        System.out.println(owner);
        System.out.println(age);
    }
}
