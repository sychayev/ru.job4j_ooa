package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (i == el) {
                rst = data[i];
                break;

            }
        }

        return rst;
    }

    public static void main(String[] args) {
        int[] num = new int[]{5, 4, 3, 2};
        System.out.println(FindLoop.indexOf(num, 5));
        int[] num1 = new int[]{89, 2, 34, 54, 4};
        System.out.println(FindLoop.indexOf(num1, 2));

    }


}
