package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] == el) {
                rst = data[i];
//                System.out.println(rst);
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] num = new int[]{5, 4, 3, 2};
//        int[] rsl  = FindLoop.indexOf(num);
        System.out.println(FindLoop.indexOf(num, 5));
        int[] num1 = new int[]{89, 2, 34, 54, 4};
        System.out.println(FindLoop.indexOf(num, 2));
    }


}
