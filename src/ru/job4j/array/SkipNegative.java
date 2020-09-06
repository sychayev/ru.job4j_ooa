package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");

            }
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, -2}, {1, 2}};
        SkipNegative.skip(array1);
        int[][] array2 = new int[][]{{-1, -2}, {1, 2}, {98, -123, 6}};
        SkipNegative.skip(array2);
        int[][] array3 = new int[][]{{12, 98, 45}, {-987, -45, -6}, {678, -367, -7}};
        SkipNegative.skip(array3);
    }

}

