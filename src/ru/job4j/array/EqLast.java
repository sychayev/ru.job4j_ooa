package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {

        int lft = left[left.length - 1];
        int rght = right[right.length - 1];

        if (lft == rght) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int res1[] = new int[]{1, 2, 3};
        int res2[] = new int[]{5, 4, 3};
        System.out.println(EqLast.check(res1, res2));
        int res3[] = new int[]{1, 2, 9};
        int res4[] = new int[]{3, 3, 3};
        System.out.println(EqLast.check(res3, res4));

    }
}
