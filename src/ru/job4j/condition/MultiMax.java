package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {

        int firstMax = first > second ? first : second;
        int thirdMax = third > firstMax ? third : firstMax;
        return thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(100, 8, 94));
        System.out.println(MultiMax.max(45, 63, 43));
        System.out.println(MultiMax.max(76, 31, 93));
    }
}
