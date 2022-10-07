package com.pluralsight.basics.strings;

import java.util.Locale;

public class MethodsString {
    public static void main(String[] args) {
        /*
        Estos son los metodos mas usados en Strings
        */

        String message = "      HOLA si, buenas?    :)     ";

        //Tamaño
        int size = message.length(); // tener en cuenta q el espacio tambien cuenta

        /*
        Nuevos String a partir de uno viejo
         */
        String nuevo1 = message.concat(" si si todo bien :V");
        System.out.println(nuevo1);

        String nuevo2 = message.replace('a', '-');
        System.out.println(nuevo2);

        String nuevo3 = message.toLowerCase(Locale.ROOT); //todo a Minuscula
        System.out.println(nuevo3);

        String nuevo4 = message.toUpperCase(Locale.ROOT); // todo a Mayusculas
        System.out.println(nuevo4);

        String nuevo5 = message.trim(); // remueve los espacios al final y adelante
        System.out.println(nuevo5);

        System.out.println("");
        System.out.println("Lista de Strings");
        // Obtener lista de String a partir de un String
        String[] myLista = message.split(", "); // ["     HOLA si", "buenas?    :)    "]
        for(String valor : myLista) {
            System.out.println(valor);
        }

        System.out.println("");
        /*
        Metodos para obtener Partes de un String
        */
        String subMessage1 = message.substring(11); // trae desde la 11 inclusive hasta el final
        System.out.println(subMessage1);
        subMessage1 = message.substring(11, 14); // no incluye la posicion 14
        System.out.println(subMessage1);
        char letter = message.charAt(11); // trae el char de la posicion determinada
        System.out.println(letter);


        System.out.println("");
        /*
        Metodos para Validar un String
        */

        boolean valid1 = message.contains("si");
        System.out.println(valid1);
        boolean valid2 = message.contains("blabla");
        System.out.println(valid2);

        valid1 = message.startsWith("      HOLA si");
        System.out.println(valid1);
        valid2 = message.endsWith(" ");
        System.out.println(valid2);

        /*
        Obtener Posiciones
        */
        int pos = message.indexOf("HOL"); //nos trae la posicion donde inicia la primera coincidencia
        System.out.println(pos);
        int pos2 = message.lastIndexOf("HOL"); //nos trae la posicion donde por ultima vez se hizo match
        System.out.println(pos2);


        /*
        Comparaciones
        */
        boolean sonIguales = "blaBLA".equals("blabla");
        System.out.println(sonIguales);

        boolean sonIgualesNoCase = "blaBLA".equalsIgnoreCase("blabla");
        System.out.println(sonIgualesNoCase);

        boolean esVacia1 = "".isEmpty();
        System.out.println(esVacia1);

        boolean esVacia2 = "qweq".isEmpty();
        System.out.println(esVacia2);
    }
}
