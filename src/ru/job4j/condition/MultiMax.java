package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result= first ;
        int firstMax = ((first > second || second <third)&&(first > third))?first:third;
        int secondMax = ((second > first || first < third)&&(second > third))?second:firstMax;
        int thirdMax= ((third > firstMax || firstMax < secondMax)&&(third > secondMax ))?third:secondMax ;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(100, 8, 94));
        System.out.println(MultiMax.max(45, 63, 43));
        System.out.println(MultiMax.max(76, 31, 93));
    }
}
