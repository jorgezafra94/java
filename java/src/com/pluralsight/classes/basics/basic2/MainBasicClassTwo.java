package com.pluralsight.classes.basics.basic2;

public class MainBasicClassTwo {

    public static void main(String[] args) {
        /*
         Creamos instancia a partir de constructor vacio
         si no hubieramos creado el constructor vacio esta instanciacion no seria posible
         */
        BasicClassTwo twoEmpty = new BasicClassTwo();
        System.out.println(twoEmpty.x);
        System.out.println(twoEmpty.y);

        /*
        * Creamos instancia seteando un valor para x, acordemonos que no pudimos crear un
        * constructor unico para setar unicamente y porque este es el mismo constructor
        * que el de x, lo hubieramos podido hacer si y hubiera tenido otro tipo de variable
        */
        System.out.println();
        BasicClassTwo twoX = new BasicClassTwo(300);
        System.out.println(twoX.x);
        System.out.println(twoX.y);

        /*
        * Creamos instancia seteando valor de X y Y, esto lo podemos hacer debido a el constructor
        * con dos parametros que tiene la clase
        */
        System.out.println();
        BasicClassTwo twoXY = new BasicClassTwo(400, 500);
        System.out.println(twoXY.x);
        System.out.println(twoXY.y);
    }
}
