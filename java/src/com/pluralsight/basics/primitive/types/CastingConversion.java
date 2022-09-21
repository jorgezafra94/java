package com.pluralsight.basics.primitive.types;

public class CastingConversion {
    /*
    Hay dos maneras de casteo una la explicita y la implicita,
    la implicita ocurre automaticamente en el compilador, y se crea cuando
    se pasa de un tipo de variable mas pequeño a un tipo de variable mas grande
    y el explicito el cual se realiza mediante codigo, donde si es necesario
    decirle a que tipo de variable lo queremos convertir

    cuando se realiza el casteo explicito, dependiendo del valor a castear podemos
    tener perdida de informacion ya que estamos, pasando de un tipo mas grande a un tipo
    de variable mas pequeña
     */

    public static void main(String[] args) {
        // Implicito
        int x = 89;
        long newValue = x;

        // explicito
        long y = 924L;
        int newValue2 = (int) y; // si no le agregamos el (int) saldrá error
    }
}
