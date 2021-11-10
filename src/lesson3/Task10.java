package lesson3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1,2,2,4,5,1,-1,-2,-1,0,0};
        Arrays.sort(array);
        int zero = array[0] -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && zero != array[i]){
                    System.out.print(array[i] + " ");
                    zero = array[i];

                }
            }
        }


}
}
