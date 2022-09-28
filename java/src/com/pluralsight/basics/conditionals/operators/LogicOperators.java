package com.pluralsight.basics.conditionals.operators;

public class LogicOperators {
    public static void main(String[] args) {
        /*
        Los operadores condicionales logicos son 3

        AND -> &&
        OR -> ||
        NOT -> !

        igual estos devuleven un boolean
        */

        int value1 = 98;
        int value2 = 71;

        boolean resultado;

        /*
        AND

        Si o si las dos condiciones deben ser true para que devuelva true,
        si una de las dos es false devuelve false

        Si la primera condicion es false, no evalua la siguiente condicion porque ya no importa ya es false
        */
        resultado = value1 < 1000 && value2 != 0;

        /*
        OR

        Si una de las dos condiciones es true devuelva true,
        si ambas condiciones son false devuelve false

        Si la primera condicion es true, no evalua la siguiente condicion porque ya no importa ya es true
        */
        resultado = value1 < 1000 || value2 != 0;

        /*
        NOT

        Niega la condicion es decir

        !(true) -> nos devuelve false
        !(false) -> nos devuelve true

        */
        resultado = !(value1 < 1000 || value2 != 0);

        System.out.println(resultado);



        /*-------------------------------------------------------------------------------------------*/
        /*
        Los operadores logicos normales son

        AND -> &
        OR -> |

        No se usan en codigo ya que no son condicionales y de cualquier forma siempre evaluarán
        ambas condiciones

        int valor = 0;

        boolean result = (valor != 0) & (34/valor > 0);

        nos dará un error ya que la primera condicion es false pero como es operador logico normal
        va a evaluar la siguiente condicion donde, si dividimos un numero por 0 sale error

        POR ESO USAMOS OPERADORES LOGICOS CONDICIONALES
        */
    }
}
