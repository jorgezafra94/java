package com.pluralsight.classes.advanced.initializationBlocks;

public class InitializationClass {
    /*
    Los bloques de inicializacion son bloques que ejecutan un codigo en particular.
    Este codigo SIEMPRE se va a correr antes de crear una instancia, y todo constructor
    si o si lo va a ejecutar
    */

    private int size;
    private String word;

    // Este es el bloque de inicializacion, y se corre antes de ejecutar cualquier constructor
    {
        for(int i = 3; 0 < i; i--) {
            System.out.println("Starting in " + i);
        }
        size = 9;
        word = "Go";
    }

    public InitializationClass() {
        System.out.println(word);
        System.out.println(size);
    }

    public InitializationClass(int size) {
        System.out.println("before value of size " + this.size);
        this.size = size;
        System.out.println(this.word);
        System.out.println(this.size);
    }

    public InitializationClass(String word) {
        System.out.println("before value of word " + this.word);
        this.word = word;
        System.out.println(this.word);
        System.out.println(this.size);
    }
}
