package lesson3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int number = 0;
        String cmd;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите одну из трёх команд: increase, decrease или exit");
        do {
            cmd = sc.nextLine();
            switch (cmd){
                case "increase":
                    number++;
                    System.out.println("Вы увеличили число на единицу, можете ввести ещё команду");
                    break;
                case "decrease":
                    System.out.println("Вы уменшили число на единицу , можете ввести ещё команду");
                    number--;
                    break;
                case "exit":
                    System.out.println("Вот что получилось ----> " + number );
                    flag = false;
                    break;
                default:
                    System.out.println("Введенная неверная команда. Попробуйте ещё раз");

            }
        }while (flag);
    }
}
