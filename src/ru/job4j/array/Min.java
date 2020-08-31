package ru.job4j.array;

public class Min {
    public static int findMin(int array[]) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < i) {
                System.out.println(min);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] mas1 = new int[]{0, 5, 10};
        int[] mas2 = new int[]{10, 5, 3};
        int[] mas3 = new int[]{10, 2, 5};
    }
}
