package lesson3;

public class Task8 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1, 4, 3},
                         {2, 3, 4, 4, 4, 1},
                         {3, 1 ,1 ,1}};
        int longestArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length > longestArray){
                longestArray = array[i].length;
            }
        }
        int[] sum = new int[longestArray];
        System.out.println(longestArray);
        for ( int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++){
                sum[j] +=array[i][j];


            }


        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Сумма " + (i + 1) + " столбца равна: " + sum[i]);

        }

        }

    }

