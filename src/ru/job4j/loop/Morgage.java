package ru.job4j.loop;

public class Morgage {

    public static int year(int amount,int salary,double percent){
        int year = 0;

        while(year > 0 ){
          year =   amount +=salary * percent;
        }

        return year;
    }

    public static void main(String[] args) {
        System.out.print(Morgage.year(1000,50,12));
    }
}
