package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int s = w * h;
        return s;
    }

    public static void main(String[] arg){
        int result = SqArea.square(4,1);
        System.out.println(" p = 4,k = 1, " + result );
        int result1 = SqArea.square(6,2);
        System.out.println(" p = 6,k = 2, " + result );
    }

}
