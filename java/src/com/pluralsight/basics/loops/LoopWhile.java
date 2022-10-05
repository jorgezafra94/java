package com.pluralsight.basics.loops;

public class LoopWhile {
    public static void main(String[] args) {
        /*
        El while loop es un evento ciclico que se usa normalmente cuando no
        tenemos el numero exacto de veces que debe repetir un bloque de codigo

        el while loop cuenta con 3 partes normalmente:
        * el condicional
        * el bloque o logica
        * la regla para romper el loop

        Siempre debe tener algo para afectar la condicion y romper el ciclo de lo
        contrario va a ser un ciclo infinito

        Tener en cuenta que si la condicion no se cumple nunca entrará al loop
        y por cada iteracion va a evaluar la condicion para saber si debe repetir
        o no el bloque de codigo
        */

        int value = 9;
        while(value < 20) {
            System.out.println(value);
            value++; //condicion que nos ayuda a romper el loop tarde o temprano
        }
    }
}
