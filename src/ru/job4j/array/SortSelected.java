package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapazon.findMin(data, 0, data.length);
            int index = FindLoop.indexOf2(data, min, 0, data.length);
//            if (data[i] < data[i + 1]) {
//                int temp = data[i];
//                data[i] = data[i + 1];
//                data[i + 1] = temp;
//            }
//            if (min < index + 1) {
//                int temp = data[min];
//                data[min] = data[min + 1];
//                data[min + 1] = temp;
//            }
            if (min < index+ 1) {
                int temp = data[index];
                data[index] = data[min + 1];
                data[min + 1] = temp;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int mas1[] = new int[]{3, 1, 2};
        System.out.println(SortSelected.sort(mas1));
        int mas2[] = new int[]{8, 7, 9, 6, 1};
        System.out.println(SortSelected.sort(mas2));
        int mas3[] = new int[]{23, 10, 45, 2};
        System.out.println(SortSelected.sort(mas3));
    }
}
