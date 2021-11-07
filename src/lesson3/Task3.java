package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();
        System.out.println("Между ними вот что");
        if (first == second || first == second + 1 || second == first +1){
            System.out.print("А ничего, лол)");
            return;
        }
        for (int i = Math.min(first,second) + 1; i <Math.max(first, second); i++) {
            System.out.print(i + " ");

        }
    }
}
