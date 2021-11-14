package lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Какова длина массива?");
        int length = sc.nextInt();
        int[] IntArray = new int[length];
        System.out.println("ведите все элементы массива");
        int maxValue = 0;

        for (int i = 0; i < length; i++) {
            IntArray[i] = sc.nextInt();
            if (IntArray[i] > maxValue){
                maxValue = IntArray[i];
            }
        }
        System.out.println(maxValue);




        }
}

