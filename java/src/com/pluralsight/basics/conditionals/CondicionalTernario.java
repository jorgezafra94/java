package com.pluralsight.basics.conditionals;

public class CondicionalTernario {
    public static void main(String[] args) {
        /*
        Los ternarios son condicionales que SIEMPRE devuelven un VALOR
        y SIEMPRE deben estar compuestos por parte verdadera y parte falsa

        la estructura de un Ternario es

        int resultado = condicion ? valor_true : valor_false;
        */

        int valor1 = 89;
        int valor2 = 78;

        int resultado = valor2 > valor1 ? 9999 : -1111;
        System.out.println(resultado);
    }
}
