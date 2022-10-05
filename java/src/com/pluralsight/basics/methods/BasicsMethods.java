package com.pluralsight.basics.methods;

public class BasicsMethods {
    public static void main(String[] args) {
        /*
        Los metodos son bloques de codigo, que se pueden reusar

        estos tienen modificadores de acceso (public, protected, private)
        pueden o no devolver informacion (void, otro tipo)
        pueden o no llevar PARAMETROS (ARGUMENTOS es cuando se invoca el metodo)
        */

        int value1 = 90;
        int value2 = 80;
        int result;

        /*
        Metodo con un tipo de return:
        Estos metodos son los que en su logica generan un nuevo objeto o lo calculan y lo devuelven para
        futuro uso
        */
        result = calculateSum(value1, value2);
        /*
        Metodo void:
        no devuelve nada, este se usa para imprimir algo en pantalla o a veces para modificar un objeto
        */
        imprimirResultado(result);


        value1 = 123;
        value2 = -120;
        result = calculateSum(value1, value2);
        imprimirResultado(result);
    }

    public static int calculateSum(int val1, int val2) {
        return val1 + val2;
    }

    public static void imprimirResultado(int result) {
        System.out.println("El resultado final fue " + result);
    }
}
