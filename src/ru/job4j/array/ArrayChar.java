package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char i = 0; i <= word.length; i++) {
            for (char j = 0; j <= pref.length; j++) {
                if (word != pref) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] mas1 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] mas2 = new char[]{'H', 'e'};
        char[] mas3 = new char[]{'H', 'i'};
        System.out.println(ArrayChar.startsWith(mas1, mas2));
        System.out.println(ArrayChar.startsWith(mas1, mas3));
    }
}
