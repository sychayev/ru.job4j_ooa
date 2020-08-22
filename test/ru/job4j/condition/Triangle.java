package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean treangle = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return treangle;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(2.0,2.0,2.0));
    }

}
