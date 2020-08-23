package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            return first;
        }
        if (second > first && second > third) {
            return second;
        }
        if (third > first && third > second) {
            return third;
        }
        if (second == first && second == third) {
            return first;
        }
        if (second == first && first > third) {
            return first;
        }
        if (first == third && first > second) {
            return first;
        }
        if (second == third && second > first) {
            return second;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("FirstMax = " + ThreeMax.max(10, 5, 1));
        System.out.println("SecondMax = " + ThreeMax.max(10, 50, 1));
        System.out.println("ThirdMax = " + ThreeMax.max(1, 5, 100));
        System.out.println("AllEq = " + ThreeMax.max(1, 1, 1));
        System.out.println("FirstEqSecond = " + ThreeMax.max(10, 10, 1));
        System.out.println("FirstEqThird = " + ThreeMax.max(100, 1, 100));
        System.out.println("SecondEqThird = " + ThreeMax.max(1, 100, 100));
    }

}
