package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean prime = number > 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = true;
                break;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
        System.out.println(CheckPrimeNumber.check(4));
        System.out.println(CheckPrimeNumber.check(2));
    }
}