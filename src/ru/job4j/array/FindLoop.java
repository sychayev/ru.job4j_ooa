package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
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
        int[] num = new int[]{1, 2, 3, 4, 5};
//        int[] rsl  = FindLoop.indexOf(num);
        System.out.println(FindLoop.indexOf(num, 3));
    }


}
