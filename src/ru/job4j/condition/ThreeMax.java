package ru.job4j.condition;

public class ThreeMax {


    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first) {
            result = second;
        }
        if (result < third) {
            result = third;
        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println(ThreeMax.max(10, 5, 1));
        System.out.println(ThreeMax.max(10, 50, 1));
        System.out.println(ThreeMax.max(11, 12, 13));
    }

}
