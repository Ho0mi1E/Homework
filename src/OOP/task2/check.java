package OOP.task2;

public class check {
    public static void main(String[] args) {
        Director kek = new Director("rtr", "r",1);
        Worker worker = new Worker("1","1", 1);
        Factory factory = new Factory(kek,10);
        factory.addWorker(worker);

    }
}
