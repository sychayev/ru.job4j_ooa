package ru.job4j.loop;

public class Morgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += percent;
            amount -= salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Morgage.year(1000, 1200, 1));
        System.out.println(Morgage.year(100, 120, 50));
    }
}
