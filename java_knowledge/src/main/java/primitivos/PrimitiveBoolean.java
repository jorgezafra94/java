package primitivos;

public class PrimitiveBoolean {
  public static void main(String[] args) {
    /*
     * los boolean primitivos son variables que unicamente guardan un valor true o false
     * estos no pueden ser nulos
     *
     * cuando se crea un booblean por defecto es false
     */

    boolean datoLogico = true; //Boolean.TRUE
    boolean datoLogico2 = false; //Boolean.FALSE

    // podemos crear booleanos mediante operadores de comparacion

    datoLogico = 5 < 10;
    System.out.println(datoLogico);
  }
}
