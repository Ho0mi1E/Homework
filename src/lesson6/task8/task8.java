package lesson6.task8;

public class task8 {
    public static void main(String[] args) {
        String sc ="123";
        char[] a =sc.toCharArray();

        for (int i = a.length; i > 0; i--) {
            System.out.print(a[i-1]);

        }
    }
}
