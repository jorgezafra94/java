package com.pluralsight.basics.loops;

public class LoopFor {
    public static void main(String[] args) {
        /*
        el For loop es uno de los mas usados, se usa normalmente
        cuando tenemos el numero exacto de veces que debe repetir
        un bloque de codigo

        consta de:
        * el condicional
        * el bloque o logica
        * la regla para romper el loop

        Siempre debe tener algo para afectar la condicion y romper el ciclo de lo
        contrario va a ser un ciclo infinito

        hay varias formas de escribir el for
        */

        // declarando la variable adentro
        System.out.println("declarando la variable adentro");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("");
        // declarando la variable afuera, aqui lo que afecta es el scope de la variable
        System.out.println("declarando la variable afuera, aqui lo que afecta es el scope de la variable");
        int j = 0;
        for(; j < 5; j++) {
            System.out.println(j);
        }

        System.out.println("");
        // variable afuera y condicional adentro
        System.out.println("variable afuera y condicional adentro");
        int k = 0;
        for(;;k++){
            if(k == 5) {
                break;
            }
            System.out.println(k);
        }

        System.out.println("");
        // toda la logica afuera del for
        System.out.println("toda la logica afuera del for");
        int p = 0;
        for(;;){
            if (p == 5) {
                break;
            }
            System.out.println(p);
            p++;
        }
    }

}
