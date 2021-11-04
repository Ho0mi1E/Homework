package lesson2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(((b + (Math.sqrt(Math.pow(b,2) + 4 * a * c))) / (2 * a)) - Math.pow(a,3) * c + Math.pow(b,-3));
    }
}
