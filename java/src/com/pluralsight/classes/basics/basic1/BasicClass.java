package com.pluralsight.classes.basics.basic1;

public class BasicClass {
    /*
     * Las clases son las encargadas de definir un comportamiento.
     * A partir de estas podemos crear objetos o tambien conocidos como instancias
     * Las clases pueden tener diferentes modificadores de acceso tipo public, protected, etc
     * Las clases pueden tener 1 o varios constructores, si no definimos constructores por defecto se creará
       un constructor vacio a la hora de la compilacion
     * Las clases pueden tener atributos por ejemplo la clase humano tiene atributos como nombre, apellido, sexo, etc
       estos atributos tambien se conocen como campos, estos tambien pueden tener diferentes modificadores de acceso
     * Las clases pueden tener metodos, que son las acciones que puede realizar un objeto de determinada clase, estas
       acciones deben tener relacion con la clase por ejemplo un metodo acelerar de la clase Carro o Automovil
    */

    public Integer x;
    private Integer y = 0;

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer calculate() {
        return this.x * this.y;
    }
}
