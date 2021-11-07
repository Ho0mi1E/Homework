package lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] Array = {{},{45,3344,6767},{1}}; // введите любе числа куда угодно, можете ещё массивов добавить
        int min = 999999999;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] < min){
                    min = Array[i][j];

                }


            }

        }
        System.out.println(min);
    }
}
