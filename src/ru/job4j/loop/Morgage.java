package ru.job4j.loop;

public class Morgage {

    public static int year(int amount, int salary, double percent) {
        int year = 1;
        int ammountAfterYear = amount - salary;

        while (year > 0) {
            year = ammountAfterYear *= percent += ammountAfterYear;
            year++;
//            if (ammountAfterYear == 0) {
//                break;
//            }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Morgage.year(1000, 1200, 1));
        System.out.println(Morgage.year(100, 120, 1));
    }
}
