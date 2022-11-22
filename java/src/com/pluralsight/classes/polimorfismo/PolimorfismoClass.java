package com.pluralsight.classes.polimorfismo;

public class PolimorfismoClass {
    /*
    El polimorfismo es la capacidad que tienen los objetos de una clase en ofrecer
    respuesta distinta e independiente en función de los parámetros.

    El ejemplo mas claro en java es el tema de la sobrecarga de metodos, donde
    podemos tener varios metodos con el mismo nombre pero con diferentes parametros
    */

    public String getResult() {
        return "No hay nada que calcular";
    }

    public String getResult(int x, int y) {
        int calculation = x + y;
        return "el resultado es: " + calculation;
    }

    public String getResult(int x, int y, String message) {
        int calculation = x + y;
        return message + calculation;
    }
}
