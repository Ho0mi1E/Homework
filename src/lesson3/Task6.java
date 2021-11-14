package lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какова длина массива?");
        int length = sc.nextInt();
        int[] IntArray = new int[length];
        System.out.println("ведите все элементы массива");
        int b = 0;
        for (int i = 0; i < length; i++) {
            IntArray[i] = sc.nextInt();
            if (IntArray[i] > 0 && IntArray[i] % 2 == 0 ) {
                b += IntArray[i];
            }
        }
        System.out.println(b);
    }
}
