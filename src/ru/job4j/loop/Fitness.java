package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            int ivanInMonth = ivan * 3;
            int nikInMonth = nik * 2;
            month = ivanInMonth / nikInMonth;
            month++;
            if (ivan > nik) {
                break;
            }

        }
        return month;

    }

    public static void main(String[] args) {
        System.out.println(Fitness.calc(95, 90));
        System.out.print(Fitness.calc(90, 95));
        System.out.print(Fitness.calc(50, 90));
    }
}
