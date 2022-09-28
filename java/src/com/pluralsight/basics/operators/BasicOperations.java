package com.pluralsight.basics.operators;

public class BasicOperations {

    public static void main(String[] args) {

        int value1 = 8;
        int value2 = 9;
        int result;

        // suma
        result = value1 + value2;

        // resta
        result = value1 - value2;

        // multiplicacion
        result = value1 * value2;

        /*
        division

        La division es importante porque si deividimos enteros vamos a obtener solamente la parte entera
        mas no la division exacta

       resultado = 7 / 2 -> nos va a devolver 3, porque 7/2 = 3.5 pero la parte entera es 3

       tener cuidado de que el divisor no sea 0 sino nos dara un error
        */
        result = value1 / value2;

        // Modulo
        result = value1 % value2;

        /*
        Incrementar/decrementar y luego asignar

        ++value
        --value

        incrementa value y luego lo asigna
        */

        result = ++value1;

        /*
        Incrementar/decrementar luego de asignar

        value++
        value--

        primero asigna el valor y luego lo incrementa
        */

        result = value1++;

        System.out.println(result);
    }
}
