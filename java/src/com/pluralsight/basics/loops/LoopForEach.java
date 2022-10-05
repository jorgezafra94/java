package com.pluralsight.basics.loops;

public class LoopForEach {
    public static void main(String[] args) {
        /*
        el ForEach loop es uno de los mas usados, se usa normalmente cuando tenemos listas
        o arreglos, con este podemos traer directamente los valores, y no las posiciones
        de los elementos
        */

        int[] myArray = {1, 2, 3, 4, 5};

        for(int value : myArray) {
            System.out.println(value);
        }
    }
}
