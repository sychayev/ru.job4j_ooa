package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] mas1 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] mas2 = new char[]{'l', 'o'};
        System.out.println(EndWith.endsWith(mas1, mas2));
        char[] mas3 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] mas4 = new char[]{'l', 'a'};
        System.out.println(EndWith.endsWith(mas3, mas4));
    }
}
