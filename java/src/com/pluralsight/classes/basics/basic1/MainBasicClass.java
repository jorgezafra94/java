package com.pluralsight.classes.basics.basic1;

public class MainBasicClass {
    public static void main(String[] args) {

        // creamos instancia
        BasicClass myBasicClass = new BasicClass();

        // seteamos x, el campo x al ser public podemos acceder y modificarlo directamente
        myBasicClass.x = 89;

        /* seteamos y, el campo y al ser private, tenemos que crear un metodo especifico para
        setearle el valor, por eso creamos el metodo setY dentro de la clase
        */
        myBasicClass.setY(9);

        // llamamos metodo public de la clase, si es un metodo private, no lo podemos llamar por fuera de la clase
        Integer result = myBasicClass.calculate();
        System.out.println(result);

        /*--------------------------------------------------------------------------------------------------------*/

        /* el campo x al ser un tipo Objecto y no un primitivo, su inicializacion será null, mientras que el campo y
        si le dimos un valor por defecto de 0
        */
        BasicClass myBasicClass2 = new BasicClass();
        // Integer result2 = myBasicClass2.calculate(); -> dará una excepcion porq null no se puede multiplicar con 0

        // para ello seteamos x al menos porque con y ya es 0

        myBasicClass2.x = 9;
        Integer result2 = myBasicClass2.calculate();
        System.out.println(result2);
    }
}
