package com.pluralsight.classes.encapsulacion.basics;

public class MainMyClass {
    public static void main(String[] args) {
        // tenemos que crear una instancia de MyClass para acceder a sus metodos
        // si vemos usamos el constructor vacio que es el por defecto
        MyClass m = new MyClass();

        System.out.println(m.calculateBig());
        // System.out.println(m.calculatePriv()); -> este no se puede llamar porq es privado
        // siempre tener en cuenta los modificadores de acceso
    }
}
