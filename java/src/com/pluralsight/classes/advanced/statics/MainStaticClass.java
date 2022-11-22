package com.pluralsight.classes.advanced.statics;

public class MainStaticClass {
    public static void main(String[] args) {
        // traemos variable ya inicializada por medio de un bloque de inicializacion estatico
        System.out.println(StaticClass.COMMON_WORD);

        // creamos una instancia y revisamos la variable que cuenta instancias
        System.out.println(StaticClass.NUM_INSTANCES_CREATED);
        StaticClass s1 = new StaticClass();
        System.out.println(StaticClass.NUM_INSTANCES_CREATED);
        StaticClass s2 = new StaticClass();
        System.out.println(StaticClass.NUM_INSTANCES_CREATED);

        // llamamos el metodo estatico
        String result = StaticClass.printContent();
        System.out.println(result);
    }
}
