package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {

        for (int i = 2; i == left[2]; i++) {
            for (int j = 2; j == right[2]; j++) {
//                System.out.println(i + j);
                if (i == j) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int res1[] = new int[]{1, 2, 3};
        int res2[] = new int[]{5, 4, 3};
        System.out.println(EqLast.check(res1, res2));
//        int res3[] = new int[]{1, 2, 3};
////        int res4[] = new int[]{3, 3, 4};
//        System.out.println(EqLast.check(res3, res4));
    }
}
