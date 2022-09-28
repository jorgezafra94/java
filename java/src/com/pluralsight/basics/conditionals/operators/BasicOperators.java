package com.pluralsight.basics.conditionals.operators;

public class BasicOperators {
    public static void main(String[] args) {
        /*
        Estos son los operadores basicos de los condicionales

        tener en cuenta que estos siempre van a devolver un boolean
        */

        boolean resultado;
        int value1 = 90;
        int value2 = 70;

        // mayor extrictamente que
        resultado =  value1 > value2;

        // mayor o igual que
        resultado = value1 >= value2;

        // menor extrictamente que
        resultado = value1 < value2;

        // menor o igual que
        resultado = value1 <= value2;

        // es igual que
        resultado = value1 == value2;

        // es diferente que
        resultado = value1 != value2;
    }
}
