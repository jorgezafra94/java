package com.pluralsight.classes.basics.This;

public class ThisClass {
    /*
    * Ya hemos visto el uso de la palabra "this", esta palabra la usamos en los setters muy amenudo
      por ejemplo:

      public void setX(int x) {
        this.x = x;
      }

    * este this significa la clase actual, es decir el campo x de esta instancia actual la vamos a igualar
      al x que nos llego, ademas con el this nos ayudamos a diferenciar dos variables con el mismo nombre
      pero que una pertenece al campo de la clase y otra es un nombre de variable cualquiera

      por ejemplo el this no es necesario si tenemos el campo x de la clase, pero el nombre de la variable es
      otro, porque ya se entiende que de por si el x es el campo de la clase.

      public void setX(int p) {
        x = p;
      }

    * el this tambien lo podemos usar para decir que estamos usando un metodo de la instancia actual con
      this.calculate() por ejemplo
    */

    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int calculatePowerTotal() {
        int aux = 10;
        return aux * this.calculateConstantPower() + this.calculateNormalPower();
    }

    private int calculateConstantPower() {
        return this.getPower() * 5;
    }

    private int calculateNormalPower() {
        return this.getPower() + 20;
    }
}
