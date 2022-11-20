package com.pluralsight.classes.advanced.constructorsAdvanced;

public class MyConstruct {
    /*
    Ya habiamos visto lo basico de los constructores por ejemplo que podiamos tener mas de
    un constructor por clase, y que estos nos permitian crear instancias de diferentes formas
    dependiendo de los constructores que teniamos en la clase.

    ahora vamos a aprender varias cosillas como por ejemplo las cadenas de constructores
    que literalmente es la forma de reutilizar constructores entre si.

    Siempre que usemos cadena de constructores es buena practica llamar del mas grande al mas pequeño
    */

    public int freeBags;
    public int checkedBags;

    public MyConstruct(int freeBags) {
        this.freeBags = freeBags;
    }

    /*
    public MyConstruct(int freeBags, int checkedBags) {
        this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }
    En vez de usar este constructor podemos usar cadena de constructores
    */

    public MyConstruct(int freeBags, int checkedBags) {
        this(freeBags); // este llama implicitamente al primer constructor
        this.checkedBags = checkedBags;
    }
}
