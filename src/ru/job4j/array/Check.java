package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;

        for (int i = 0; i < data.length; i++) {

            if (data[i] != data[0]) {
                return false;
            }
//            data[0] = true;
        }

        return result;
    }

    public static void main(String[] args) {
        boolean data1[] = new boolean[]{true, true, true};
        System.out.println(Check.mono(data1));
        boolean data2[] = new boolean[]{true, false, true};
        System.out.println(Check.mono(data2));
    }
}
