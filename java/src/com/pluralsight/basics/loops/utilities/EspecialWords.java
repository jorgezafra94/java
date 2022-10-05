package com.pluralsight.basics.loops.utilities;

public class EspecialWords {
    public static void main(String[] args) {
        /*
        Existen 3 palabras especiales para los loops

        * break; -> detiene el loop mas proximo
        * continue -> para la ejecucion e inicia la proxima repeticion
        * name : -> nos permite tagguear un loop para identificarlo
        */

        System.out.println("Break normal");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (i + j == 7) {
                    System.out.println("salimos del if en " + i + " " + j);
                    break; // si rompe, romperia el for del j y luego empezara otra iteracion con i
                }
            }
        }

        System.out.println("");
        System.out.println("Continue normal");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (i + j == 7) {
                    // si entra al if no va a ejecutar el System.out.println porque al
                    // darle continue empieza la proxima iteracion del loop J
                    continue;
                }
                System.out.println("salimos del if en " + i + " " + j);
            }
        }

        System.out.println("");
        System.out.println("Continue con tag");
        myfor1 : for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (i + j == 7) {
                    // si entra al if no va a ejecutar el System.out.println porque al
                    // darle continue empieza la proxima iteracion PERO del LOOP I
                    continue myfor1;
                }
                System.out.println("salimos del if en " + i + " " + j);
            }
        }
    }
}
