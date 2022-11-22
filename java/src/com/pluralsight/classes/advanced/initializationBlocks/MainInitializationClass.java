package com.pluralsight.classes.advanced.initializationBlocks;

public class MainInitializationClass {
    public static void main(String[] args) {

        InitializationClass i1 = new InitializationClass();
        System.out.println();
        InitializationClass i2 = new InitializationClass(2);
        System.out.println();
        InitializationClass i3 = new InitializationClass("STOP!!");
    }
}
