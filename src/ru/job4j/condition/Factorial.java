package ru.job4j.condition;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
        int result;
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(3));
        System.out.println(Factorial.calc(5));
        System.out.println(Factorial.calc(0));
    }
}
