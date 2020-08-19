package ru.job4j.calculate;

public class MathFunc {

    public static int func1(int x){
        int result = x /10;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MathFunc.func1(100));

    }
}
