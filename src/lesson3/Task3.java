package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        for (int i = Math.min(first,second) + 1; i <Math.max(first, second); i++) {
            System.out.print(i + " ");

        }
    }
}
