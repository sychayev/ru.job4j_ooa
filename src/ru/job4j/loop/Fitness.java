package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
//        int ivanInMonth = ivan * 3;
//        int nikInMonth = nik * 2;
        while (ivan < nik) {
//            month = ivanInMonth / nikInMonth;
            int month1 = ivan * 3 / nik;
//            System.out.println(month++);
            month = month1;
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
