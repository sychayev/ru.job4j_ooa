package ru.job4j.array;

public class Min {
    public static int findMin(int array[]) {

        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
//            System.out.println(i);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] mas1 = new int[]{0, 5, 10};
        System.out.println(Min.findMin(mas1));
        int[] mas2 = new int[]{10, 5, 3};
        System.out.println(Min.findMin(mas2));
        int[] mas3 = new int[]{10, 2, 5};
        System.out.println(Min.findMin(mas3));

    }
}
