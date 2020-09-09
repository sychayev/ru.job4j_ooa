package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = point + 1; j < array.length; j++) {
                    if (array[j ] != null) {
                        String temp = array[point ];
                        array[point ] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.println(compressed[i]);
        }
    }

}
