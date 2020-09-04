package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
//        for (int j = pref.length - 1; j >= 0; j--) {
            if (word[word.length - 1] != pref[pref.length - 1]) {
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
