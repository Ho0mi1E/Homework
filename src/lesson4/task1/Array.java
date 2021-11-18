package lesson4.task1;

import java.util.Arrays;

public class Array {

    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void Sort() {
        Arrays.sort(array);
        System.out.println(array);
        System.out.println(Arrays.toString(array));

    }

    public <array> void min() {
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    private void max() {
        Arrays.sort(array);
        System.out.println(array[-1]);

    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];


        }
        System.out.println(sum);
    }
}


