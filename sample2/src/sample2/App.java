// package sample2;

import sample2.Hello;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Hello name = new Hello("Bobby");
        System.out.println(name.greeting());
    }
}
