package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double formulaManWeight = (height - 100) * 1.15;
        return formulaManWeight;
    }

    public static double womanWeight(short heightWoman) {
        double formulaWomanWeight = (heightWoman - 100) * 1.15;
        return formulaWomanWeight;
    }

    public static void main(String[] args) {
        short height = 190;
        double man = Fit.manWeight(height);
        System.out.println("Man 190 is " + man);

        short heightWoman = 160;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 160 is " + woman);
    }

}
