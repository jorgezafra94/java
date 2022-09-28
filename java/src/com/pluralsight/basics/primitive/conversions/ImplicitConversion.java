package com.pluralsight.basics.primitive.conversions;

public class ImplicitConversion {
    public static void main(String[] args) {
        /*
        Esta conversion la hace automaticamente el compilador de java

        normalmente se hace de una clase pequeña al convertirla a una clase mas grande
        por ejemplo de int a long. Ya que el int tiene menos bits que el long y obviamente
        un long tiene el campo necesario para representar un int
        */

        int valor = 89768976;
        long result = valor;

        System.out.println(result);

        byte myByte = 23;
        int value = myByte;

        System.out.println(value);
    }
}
