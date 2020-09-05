package ru.job4j.array;

public class MinDiapazon {

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{-1, 0, 5, 10};
        System.out.println(MinDiapazon.findMin(array1, 1, 3));
        int[] array2 = new int[]{10, 5, 3, 1};
        System.out.println(MinDiapazon.findMin(array2, 1, 3));
        int[] array3 = new int[]{10, 2, 5, 3};
        System.out.println(MinDiapazon.findMin(array3, 0, 2));
    }
}
