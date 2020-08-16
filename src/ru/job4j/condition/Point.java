package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = (x2 - x1);
        double second = (y2 - y1);
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double formDistance = Math.sqrt(fifth);

        return formDistance;
    }

    public static void main(String[] args) {
        double result = Point.distance(9, 3, 7, 13);
        System.out.println("result (7,9) to (2,5) " + result);
    }
}
