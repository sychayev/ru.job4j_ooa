package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] mas1 = new int[][]{{10}};
        System.out.println(MatrixSum.sum(mas1));
        int[][] mas2 = new int[][]{{1, 2}, {1, 2}};
        System.out.println(MatrixSum.sum(mas2));
        int[][] mas3 = new int[][]{{1, 2, 1}, {1, 2, 0}};
        System.out.println(MatrixSum.sum(mas3));
    }

}
