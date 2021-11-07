package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] arrray = {1,2,3,4,5,6};
        int[] arrayNew = new int[arrray.length - 1];
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс того элемента который вы хотите удалить");
        do {
            index = sc.nextInt();
            if (index < 0 || index >= arrray.length ){
                System.out.println("Ошибка!!! Такого индекса нет. Попробуйте ещё раз");
            }
        }while (index < 0 || index >= arrray.length);
        System.arraycopy(arrray,0,arrayNew,0,index);
        System.arraycopy(arrray,index+ 1, arrayNew, index, arrayNew.length - index);
        System.out.println("Вот что получилось");
        System.out.println(Arrays.toString(arrayNew));
        System.out.println("Вы удалили ---> " + arrray[index]);


        }

    }

