package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik, int month) {

        while (ivan > nik) {
            month = ivan * month - nik * month;

        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(Fitness.calc(90, 100, 3));
    }
}
