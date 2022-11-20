package com.pluralsight.classes.basics.This;

public class MainThisClass {
    public static void main(String[] args) {
        ThisClass t = new ThisClass();
        t.setPower(30);

        System.out.println(t.calculatePowerTotal());
    }
}
