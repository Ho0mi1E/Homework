package lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hours = time / 3600;
        int minutes = (time - hours*3600) / 60;
        int seconds = time - (hours*3600 + minutes * 60);
        System.out.println(hours + " ч " + minutes + " мин " + seconds + " сек");
    }
}
