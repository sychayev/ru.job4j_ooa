package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[4];
        array[4] = array.length;

        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 4, 5};
        int[] res = Turn.back(num1);

    }
}
