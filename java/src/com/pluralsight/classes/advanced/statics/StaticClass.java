package com.pluralsight.classes.advanced.statics;

public class StaticClass {
    /*
    Aca ya debemos tener claro que:
    -> "final" significa que algo es "constante" es decir no cambia
    -> "static" significa que pertenece a la clase en si y no a las instancias

    "static field" -> es como si fuera un campo global, siempre en el scope de la clase
    "static method" -> es un metodo que se llama mediante la clase y no una instancia
    "static inicialization block" -> se hace una unica vez y queda disponible para todas las instancias

    tener en cuenta que todo lo estatico se debe traer mediante la clase en si
    */

    public static String COMMON_WORD;
    public static int NUM_INSTANCES_CREATED = 0;

    static
    {
        COMMON_WORD = "first time";
    }

    public StaticClass() {
        NUM_INSTANCES_CREATED++;
    }

    public static String printContent() {
        String result = String.format("%s, %d", COMMON_WORD, NUM_INSTANCES_CREATED);
        return result;
    }
}
