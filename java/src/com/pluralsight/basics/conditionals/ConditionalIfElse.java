package com.pluralsight.basics.conditionals;

public class ConditionalIfElse {
    public static void main(String[] args) {
        /*
        Estos son los condicionales mas usados
        */

        int value = 9;

        /*
        Podemos tener el if SOLO
        si cumple la condicion ENTRA y ejecuta lo que esta adentro
        si no continua con el programa
        */
        if (value > 6) {
            System.out.println("es mayor a 6");
        }


        /*
        Podemos tener el if con el else
        si cumple la condicion ENTRA y ejecuta lo que esta adentro del if
        si no la cumple AUTOMATICAMENTE entra y ejecuta lo del else
        */
        if (value > 6) {
            System.out.println("es mayor a 6");
        } else {
            System.out.println("no es mayor a 6 definitivamente");
        }

        /*
        Podemos tener el if, else if (varios) y else
        si cumple la condicion del if ENTRA y ejecuta lo que esta adentro
        si no la cumple evalua la siguiente condicion del ELSE IF
        y asi con todos los else if y en caso de que no haya cumplido ninguna
        condicion de ningun else if, entra si o si en el else y ejecuta lo que esta adentro
        */
        if (value > 6 && value < 20) {
            System.out.println("es mayor a 6");
        } else if (value > 21 && value < 50){
            System.out.println("es mayor a 21");
        } else if (value > 51 && value < 60){
            System.out.println("es mayor a 51");
        } else if (value > 61 && value < 70){
            System.out.println("es mayor a 61");
        } else {
            System.out.println("es un numero grande");
        }

        /*
        Podemos tener el if, else if (varios) PERO SIN ELSE FINAL
        si cumple la condicion del if ENTRA y ejecuta lo que esta adentro
        si no la cumple evalua la siguiente condicion del ELSE IF
        y asi con todos los else if y en caso de que no haya cumplido ninguna
        condicion de ningun else if, continua con el programa
        */
        if (value > 6 && value < 20) {
            System.out.println("es mayor a 6");
        } else if (value > 21 && value < 50){
            System.out.println("es mayor a 21");
        } else if (value > 51 && value < 60){
            System.out.println("es mayor a 51");
        } else if (value > 61 && value < 70){
            System.out.println("es mayor a 61");
        }
    }
}
