package com.pluralsight.classes.polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        PolimorfismoClass p = new PolimorfismoClass();
        System.out.println(p.getResult());
        System.out.println(p.getResult(3, 5));
        System.out.println(p.getResult(3, 5, "esto calculamos: "));
    }
}
