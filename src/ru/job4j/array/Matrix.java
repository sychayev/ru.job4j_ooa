package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] = (i + 1) * (j + 1));
            }
            System.out.println();
        }
        return table;
    }

    public static void main(String[] args) {
        int[][] mas1 = new int[][]{{2}, {2}};
        Matrix.multiple(mas1[0][0]);
        System.out.println();
        int[][] mas2 = new int[][]{{3}, {3}, {3}};
        Matrix.multiple(mas2[0][0]);
        System.out.println();
        int[][] mas3 = new int[][]{{4}, {4}, {4}, {4}};
        Matrix.multiple(mas3[0][0]);
    }
}
