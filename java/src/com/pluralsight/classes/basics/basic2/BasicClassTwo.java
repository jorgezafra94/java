package com.pluralsight.classes.basics.basic2;

public class BasicClassTwo {

    /*
    * Como habiamos dicho en BasicClass podemos tener mas de un constructor por cada clase
    * Debemos tener en cuenta que si no agregamos un constructor, por defecto la VM va a crear un constructor vacio
    * Pero si creamos al menos un constructor, nos toca crear manualmente el constructor vacio en dado caso
      de que lo queramos usar
    * CADA CONSTRUCTOR debe ser unico, es decir sus parametros de entrada DEBEN ser unicos, sus tipos el nombre
      de la variable no importa
    */
    public int x;
    public int y;

    // constructor vacio
    public BasicClassTwo() {
        this.x = 20;
        this.y = 10;
    }

    /*por ejemplo aqui no podemos usar un constructor public BasicClassTwo(int y) {...} porq seria el mismo que
    * estamos creando con X
    * */
    public BasicClassTwo(int x) {
        this.x = x;
        this.y = 20;
    }

    // usamos constructor con todos los campos de la clase
    public BasicClassTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
