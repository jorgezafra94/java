package com.pluralsight.classes.advanced.encapsulacion;

public class MyClass {
    /*
    * La Encapsulacion es la idea de ocultar determinados detalles de la implementacion, para
      esto usamos modificadores de acceso para ocultar detalles
    * tener en cuenta que:
    * * Sin Modificador de acceso -> solo será visible dentro del package
    * * public -> podrá acceder desde cualquier punto de la aplicacion
    * * private -> el scope de esto es unicamente dentro de la clase en si
    * * protected -> el scope es la clase en si y tambien pueden acceder a este las clases que hereden de la clase actual
    */

    private Integer side1 = 9;
    private Integer side2 = 6;

    // estos metodos se llaman getters and setters
    public Integer getSide1() {
        return side1;
    }

    public void setSide1(Integer side1) {
        this.side1 = side1;
    }

    public Integer getSide2() {
        return side2;
    }

    public void setSide2(Integer side2) {
        this.side2 = side2;
    }

    public Integer calculateBig() {
        // este metodo al ser public puede ser invocado desde cualquier lado
        Integer aux = 10;
        return calculatePriv() * aux;
    }

    private Integer calculatePriv() {
        // este metodo al ser privado solo puede ser invocado dentro de la clase en si, no desde afuera
        return this.side1 * this.side2;
    }
}
