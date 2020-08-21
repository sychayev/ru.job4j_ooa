package ru.job4j.condition;

public class PsevdoCod {
    public static void main(String[] args) {

        //    Обьявили A,B,C
//     if ((A > B || B < C) && (A > C)) Вывести на экран А;
//    if ((C > B || B < A) && (C > A))   Вывести на экран C;
//    if ((B > A || C < A) && (B > C))   Вывести на экран B;                               Вывести на экран B;
//    if ((A == C || B == C) && (B == A))   Вывести на экран ,что все элементы равны;

        int A = 5, B = 6, C = 7;
        if ((A > B || B < C) && (A > C)) {
            System.out.println("A is bigger than B or C!");
        } else if ((B > A || C < A) && (B > C)) {
            System.out.println("B is bigger than A or C");
        } else if ((C > B || B < A) && (C > A)) {
            System.out.println("C is bigger than A or B!");
        } else if ((A == C || B == C) && (B == A)) {
            System.out.println("There is not the biggest value here." +
                    "All elements are equals!!!");
        }

    }
}
