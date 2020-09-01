package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
//        for (int i = 0; i < left.length; i++) {
//            int temp1 = left[left.length - 1];
//            left[left.length - 1] = temp1;
//            for (int j = 0; j < right.length; j++) {
//                int temp = right[right.length - 1];
//                right[right.length - 1] = temp;
//                if (temp1 == temp) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        }
        int lft = left[2];
        int rght = right[2];

        if (lft == rght) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int res1[] = new int[]{1, 2, 3};
        int res2[] = new int[]{5, 4, 3};
        System.out.println(EqLast.check(res1, res2));
        int res3[] = new int[]{1, 2, 3};
        int res4[] = new int[]{3, 3, 4};
        System.out.println(EqLast.check(res3, res4));

    }
}
