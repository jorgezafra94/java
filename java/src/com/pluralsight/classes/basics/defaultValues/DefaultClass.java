package com.pluralsight.classes.basics.defaultValues;

public class DefaultClass {
    /*

    Los valores por defecto que usan en los campos si no les damos un valor por defecto
    * primitive -> int, short, byte, long -> 0
                -> boolean -> false
                -> char -> '\u0000'
                -> float, double -> 0.0
    * Object Reference -> null

    */

    private byte b;
    private short s;
    private int i;
    private long l;

    private boolean myB;

    private char c;

    private float f;
    private double d;

    private Integer wrapperInt;
    private Double wrapperDouble;

    public void printAllPrimitiveDefaults() {
        System.out.println("byte default " + b);
        System.out.println("short default " + s);
        System.out.println("int default " + i);
        System.out.println("long default " + l);
        System.out.println("boolean default " + myB);
        System.out.println("char default " + c + "que seria igual a '\\u0000' " + '\u0000');
        System.out.println("float default " + f);
        System.out.println("double default " + d);
    }

    public void printAllWrapper() {
        if (wrapperInt == null) {
            System.out.println("wrapperInt is null");
        }
        if (wrapperDouble == null) {
            System.out.println("wrapperDouble is null");
        }
    }
}
