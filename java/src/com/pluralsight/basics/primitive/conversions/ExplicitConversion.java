package com.pluralsight.basics.primitive.conversions;

public class ExplicitConversion {
    public static void main(String[] args) {
        /*
        La conversion Explicita si o si toca hacerla en codigo, normalmente ocurre o se debe
        realizar cuando se pasa de una variable grande a una variable de menos espacio de
        representacion.

        por ejemplo cuando queremos convertir un long a un byte

        lo malo de la conversion explicita es que podemos perder informacion, ya que como se
        decia se necesita pasar de una variable grande a una mas pequeña
         */

        long mylong = 126L;
        byte myByte = (byte) mylong;

        System.out.println(myByte);
    }
}
