package com.pluralsight.basics.loops;

public class LoopDoWhile {
    public static void main(String[] args) {
        /*
        El do while loop es un evento ciclico que no se usa con mucha frecuencia

        el do while loop cuenta con 3 partes normalmente:
        * el bloque o logica
        * la regla para romper el loop
        * el condicional

        Siempre debe tener algo para afectar la condicion y romper el ciclo de lo
        contrario va a ser un ciclo infinito

        Tener en cuenta que el DO WHILE por defecto ejecuta 1 vez minimo el bloque de codigo
        que se encuentra en el ciclo asi pase o no la condicion, ya que esta se evalue LUEGO
        del bloque de codigo
        */

        int value = 9;
        do {
            System.out.println(value);
            value++; //condicion que nos ayuda a romper el loop tarde o temprano
        } while(value > 9 && value < 20);
    }
}
