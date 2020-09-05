package ru.job4j.array;

public class FindLoop {

    public static int indexOf1(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
    public static int indexOf2(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < data.length; i++) {
            if (data[i] == data[el]) {
                rst = i;
            }
            if (data[i] == data[start]) {
                rst = i;
            }
            if (data[i] == data[finish]) {
                rst = i;
            }
            rst = i - 1;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] num = new int[]{5, 4, 3, 2};
        System.out.println(FindLoop.indexOf1(num, 5));
        int[] num1 = new int[]{5, 2, 10, 2, 4};
        System.out.println(FindLoop.indexOf2(num1, 2, 2, 4));

    }


}
