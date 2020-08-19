package ru.job4j.calculate;

public class ArgMethod {
    public static void hello(String name,int age){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Sychaev";
        int age = 33;
        ArgMethod.hello(name,age);
        ArgMethod.hello(name,age);
        ArgMethod.hello(name,age);
        ArgMethod.hello(name,age);

    }
}
