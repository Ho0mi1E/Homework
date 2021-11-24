package lesson6.task2;

public class Hello {
    public static void main(String[] args) {

        StringBuilder sr = new StringBuilder("Hello,world!");
        sr.reverse();
        sr.append("It's me");
        if (sr.length() % 2 != 0){
            sr.deleteCharAt(sr.length() / 2);
        }
        System.out.println(sr);


    }
}
