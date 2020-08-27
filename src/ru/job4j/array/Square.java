package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            System.out.print(i * i + ",");
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array1 = calculate(5);

        System.out.println(" ");

        int[] array = calculate(3);

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
}
