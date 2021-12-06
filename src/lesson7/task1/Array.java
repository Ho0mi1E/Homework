package lesson7.task1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int[] numbers = new int[sc.nextInt()];


        try {

            System.out.println("Куда вы хотите добивить число?");
            int i = sc.nextInt();
            System.out.println("Какое число");
            numbers[i] = sc.nextInt();


        }catch (ArrayIndexOutOfBoundsException ec){


            System.out.println("Вы вышли за границу массива");


        }catch (NumberFormatException ec){
            System.out.println("Это не число");
        }
        System.out.println("Вот что получилось " + java.util.Arrays.toString(numbers));
    }
}
