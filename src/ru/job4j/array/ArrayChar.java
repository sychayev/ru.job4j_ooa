package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char i = 0; i < word.length; i++) {
            i++;
            if (word[i] == pref[i]) {
                return true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] mas1 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] mas2 = new char[]{'H', 'e'};
        System.out.println(ArrayChar.startsWith(mas1, mas2));
        char[] mas3 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] mas4 = new char[]{'H', 'i'};
        System.out.println(ArrayChar.startsWith(mas3, mas4));
    }
}
