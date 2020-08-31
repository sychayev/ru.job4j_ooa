package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[3];
        array[3] = array[array.length - 1];

        for (int i = 0; i >= 0; i--) {
            System.out.println(i);
//            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 4};
        int[] res = Turn.back(num1);
//        System.out.println(res);

    }
}
