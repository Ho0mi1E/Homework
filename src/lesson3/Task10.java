package lesson3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1,2,2,4,5,1};
        Arrays.sort(array);
        int comp = 0;
        int zero = 0;
        if (array[0] == 0 && array[1] == 0) {
            System.out.print(0 + " ");
            while (array[zero] == 0) {
                zero++;
            }
        }
        int afterOne = zero;
        for (int i = afterOne; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && comp != array[i]){
                    System.out.print(array[i] + " ");
                    comp = array[i];

                }
            }
        }


}
}
