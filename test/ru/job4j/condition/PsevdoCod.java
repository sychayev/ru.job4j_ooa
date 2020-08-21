package ru.job4j.condition;

public class PsevdoCod {
    public static void main(String[] args) {

        int A = 3, B = 1, C = 1;
        if (A > B) {
            System.out.println("A is bigger than B!");
        } else {
            System.out.println("B is bigger than A!");
        }
        if (A > C) {
            System.out.println("A is bigger than C!");
        } else {
            System.out.println("C is bigger than A!");
        }


//    Обьявили A>B,B=C
//    if(A > B) Вывести на экран А;
//    else      Вывести на экран B;
//
//    else if(A > C)  Вывести на экран А;
//     else           Вывести на экран C;


    }

}
