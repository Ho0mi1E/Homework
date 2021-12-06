package lesson7.task2;

public class Check {
    public static void main(String[] args) {
        Store ac = new Store();
        User a = new User("aaa","aaa");
        ac.addUser(a);
        ac.getlogin("aaa", "aaa");
    }
}
