package ru.job4j.condition;

public class TrgArea {

    public static double area(double a,double b,double c){
        double formulaTrgArea = Math.sqrt(a * b * c);
        return formulaTrgArea;
    }

    public static void main(String[] args) {
        double res = TrgArea.area(10,5,7);
        System.out.println(res);
    }

}
