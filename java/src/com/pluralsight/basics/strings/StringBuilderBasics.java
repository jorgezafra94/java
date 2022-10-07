package com.pluralsight.basics.strings;

public class StringBuilderBasics {
    public static void main(String[] args) {
        /*
        Los String builders son la manera mas eficiente para
        crear Strings, pero la gente ahora usa algo llamado String.format
        por la facilidad
        */

        StringBuilder sb = new StringBuilder("hola");
        sb.append(" me");
        sb.append(" llamo Jorge"); // agregamos al FINAL la nueva data
        String message = sb.toString();
        System.out.println(message);

        sb.insert(5, "como estan todos? "); // insertamos en la posicion requerida
        message = sb.toString(); // asi se obtiene el string
        System.out.println(message);
    }
}
