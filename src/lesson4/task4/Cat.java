package lesson4.task4;

import lesson4.task4.Animal;

public abstract class Cat extends Animal {
    int live;
    public Cat(String name, String owner, int age, int live) {
        super(name, owner, age);
        this.live = live;
    }
    public void Claim(){
        System.out.println("Кот лезит на дерево");
    }
}
