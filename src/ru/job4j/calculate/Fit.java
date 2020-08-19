package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        double formulaManWeight = (height - 100) * 1.15;
        return formulaManWeight;
    }

    public static double womanWeight(short heightWoman) {
        double formulaWomanWeight = (heightWoman - 110) * 1.15;
        return formulaWomanWeight;
    }

    public static void main(String[] args) {
        short height = 150;
        double man = Fit.manWeight(height);
        System.out.println("Man 90 is " + man);

        short heightWoman = 130;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 65 is " + woman);

    }

}
