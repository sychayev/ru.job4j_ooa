package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = p - a;
        double second = p - b;
        double third = p - c;
        double formulaTrgArea = Math.sqrt(first * second * third);
        return formulaTrgArea;

    }

    public static void main(String[] args) {
        double res = TrgArea.area(7, 5, 7);
        System.out.println(res);
    }

}
