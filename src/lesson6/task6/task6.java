package lesson6.task6;

public class task6 {
    public static void main(String[] args) {
        String s = "22121111112";
        int count = 0;
        int a;
        int h = 0;
        do{
            a = s.indexOf("1", h +1);
            h = a;
            if (a > 0){
            count++;}

        }while (a > 0);
        System.out.println(count);

    }
}
