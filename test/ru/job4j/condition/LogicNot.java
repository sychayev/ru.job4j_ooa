package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static boolean isPositive(int num){
        return num > 0;
    }
    public static boolean notEven (int num){
        return !isEven(num);
    }
    public static boolean notPositive(int num){
        return !(num >0);
    }
    public static boolean notEvenAndPositive(int num){
      return  ( !(num > 0 ) && num >5);
    }
    public static boolean evenOrNotPositive(int num){
        return(isEven(num )||!(num > 5));
    }

    public static void main(String[] args) {
        System.out.println(LogicNot.isEven(3));
        System.out.println(LogicNot.isPositive(6));
        System.out.println(LogicNot.notEven(7));
        System.out.println(LogicNot.notPositive(-10));
        System.out.println(LogicNot.notEvenAndPositive(-5));
        System.out.println(LogicNot.evenOrNotPositive(-5));
    }
}
