package lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money / 100 + " рубля " + money % 100 + " копеек");
    }
}
