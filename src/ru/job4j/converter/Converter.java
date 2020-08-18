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
        System.out.println(Converter.rubleToDollar(150));

        int in1 = 160;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed = expected1 == out1;
        System.out.println("34568 rubles are2.Test result : " + passed);

        int in2 = 1175;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("34568 rubles are2.Test result : " + passed);

    }


}
