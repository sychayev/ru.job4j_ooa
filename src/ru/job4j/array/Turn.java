package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

//        for (int i = 0; i <= array.length / 2; i++) {
//            int temp = array[array.length - i - 1];
//            array[i] = array[i];
////            array[array.length - i - 1] = temp;
//            System.out.println(temp);
//        }
//        for (int i = 0, j = array.length/2; i < j; ++i, --j) {
//            System.out.println(array[i]);
//            System.out.println(array[j]);
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 4};
        int[] res = Turn.back(num1);
        int[] num2 = new int[]{1, 2, 3, 4, 5};
        int[] res1 = Turn.back(num2);
    }
}
