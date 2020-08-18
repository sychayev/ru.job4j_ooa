package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rs1 = value / 80;
        return rs1;
    }

    public static int rubleToDollar(int value) {
        int rs2 = value / 72;
        return rs2;

    }

    public static void main(String[] args) {

        System.out.println(Converter.rubleToEuro(160));
        int in1 = 160;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed = expected1 == out1;
        System.out.println("160 rubles are 2 euro.Test result : " + passed);

        System.out.println(Converter.rubleToDollar(220));
        int in2 = 220;
        int expected2 = 3;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("220 rubles are 3 dollars.Test result : " + passed);

    }


}
