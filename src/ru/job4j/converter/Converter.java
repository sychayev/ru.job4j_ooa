package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        int rs1 = value / 80;
        return rs1;
    }
    public static int rubleToDollar(int value){
        int rs2 = value/72;
        return rs2;
    }

    public static void main(String[] args) {
        System.out.println(Converter.rubleToEuro(345));
        System.out.println(Converter.rubleToDollar(876));
    }

}
