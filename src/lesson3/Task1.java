package lesson3;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел Фиббоначи вы хотите?");
        int count = sc.nextInt();
        if (count == 0){
            System.out.println("Ну и зачем я вам нужен(");
            return;
        }
        int firstN = 0;
        int secondN = 1;
        int thirdN;
        System.out.print (firstN + " ");
        if (count==1) {
            return;
        }
        System.out.print(secondN);
        for (int i = 0; i < count - 2; i++) {
            thirdN = firstN + secondN;
            System.out.print(" " + thirdN);
            firstN = secondN;
            secondN = thirdN;

        }
    }

}

