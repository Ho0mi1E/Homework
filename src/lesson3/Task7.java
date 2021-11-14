package lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{2},{45,3344,1,6767},{10000000}}; // введите любе числа куда угодно, можете ещё массивов добавить
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min){
                    min = array[i][j];

                }


            }

        }
        System.out.println(min);
    }
}
