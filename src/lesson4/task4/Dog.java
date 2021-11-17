package lesson4.task4;

import lesson4.task4.Animal;

public class Dog extends Animal {
    int power;

    public Dog(String name, String owner, int age, int power) {
        super(name, owner, age);
        this.power = power;
    }
    public void Dig(){
        System.out.println("Пёс копает");

    }

    @Override
    public void info() {
        super.info();
    }
}
