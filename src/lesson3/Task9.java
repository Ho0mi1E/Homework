package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random sr = new Random();
        Scanner sc = new Scanner(System.in);
        int random = sr.nextInt(4);
        int tab;
        System.out.println("Угадай число от 0 до 4");
        do {
             tab = sc.nextInt();
             if (tab != random){
                 System.out.println("Неправильно, попробуй ещё раз");
             }

        } while (random != tab);
        System.out.println("Правильно");

    }
}
