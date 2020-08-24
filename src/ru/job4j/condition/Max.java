package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int res1 = (left > right) ? left : right;
        return res1;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(2, 9));
        System.out.println(Max.max(9,9));
        System.out.println(Max.max(9,2));
    }
}
