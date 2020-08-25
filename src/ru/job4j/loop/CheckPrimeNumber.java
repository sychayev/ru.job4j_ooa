package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean prime = true;

        for (int i = 1; i <= number; i++) {
            if ((number % 5) == 0) {
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
