package lesson3;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какова длина массива?");
        int length = sc.nextInt();
        int[] intArray = new int[length];
        System.out.println(" Введите все элементы массива");
        int counter = 0;

        for (int i = 0; i < length ; i++) {
            intArray[i] = sc.nextInt();
            if (intArray[i] % 2 == 0) {
                counter += intArray[i];
        }





            }

        System.out.println("Сумма твоих чётных чисел это " + counter);
    }
}
