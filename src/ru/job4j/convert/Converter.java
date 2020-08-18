package ru.job4j.convert;

public class Converter {

    public static int rubleToEuro(int value) {
        int rs1 = value / 70;
        return rs1;
    }

//    public static int rubleToDollar(int value) {
//        int rs2 = value / 60;
//        return rs2;
//
//    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(Converter.rubleToEuro(140));

        System.out.println(Converter.rubleToDollar(180));

    }


}
