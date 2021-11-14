package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println(n + "день");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(n + "дня");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(n + "дней");
                break;

            default:
                if (n < 0){
                    System.out.println("Ошибка");
                }else {
                    System.out.println("Данная функциональность пока не доступна");
                }

        }
    }
}
