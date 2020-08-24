package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        int firstMax = ((first > second && second < third)||(first >third))?first:third;
//        int secondMax = ((second > first && first < third)&&(second > third))?second:firstMax;
//        int thirdMax= (third > second && first < second)&&(third > first)?third:secondMax ;
        return first;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(10, 8, 94));
        System.out.println(MultiMax.max(45, 23, 43));
        System.out.println(MultiMax.max(76, 31, 23));
    }
}
