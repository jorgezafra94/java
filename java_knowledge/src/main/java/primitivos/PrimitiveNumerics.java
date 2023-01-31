package primitivos;

public class PrimitiveNumerics {
  public static void main(String[] args) {
    /*
     * las variables primitivas numericas son:
     *  byte(8 bits), short(16 bits), int(32 bits), long(64 bits)
     *
     * cada uno de estos tiene sus valores limite, si se pasan habran errores
     * debido a que no pueden almacenarlos
     *
     * valores por defecto 0
     */

  /*------------------------------------------ BYTE ------------------------------*/
    byte myByte = 7;
    byte maxByte = Byte.MAX_VALUE;
    byte minByte = Byte.MIN_VALUE;

    System.out.println("este es el valor de mi byte " + myByte);
    System.out.println("el valor maximo que soporta un byte " + maxByte);
    System.out.println("el valor minimo que soporta un byte " + minByte);

    /*------------------------------------------ SHORT ------------------------------*/
    short myShort = 250;
    short maxShort = Short.MAX_VALUE;
    short minShort = Short.MIN_VALUE;

    System.out.println("este es el valor de mi short " + myShort);
    System.out.println("el valor maximo que soporta un short " + maxShort);
    System.out.println("el valor minimo que soporta un short " + minShort);

    /*------------------------------------------ INT ------------------------------*/
    int myInt = 2147483646;
    int maxInt = Integer.MAX_VALUE;
    int minInt = Integer.MIN_VALUE;

    System.out.println("este es el valor de mi int " + myInt);
    System.out.println("el valor maximo que soporta un int " + maxInt);
    System.out.println("el valor minimo que soporta un int " + minInt);

    /*------------------------------------------ LONG ------------------------------*/
    // para decirle que es un long toca agregarle L al final del valor 123L
    long myLong = 21474836461231231L;
    long maxLong = Long.MAX_VALUE;
    long minLong = Long.MIN_VALUE;

    System.out.println("este es el valor de mi long " + myLong);
    System.out.println("el valor maximo que soporta un long " + maxLong);
    System.out.println("el valor minimo que soporta un long " + minLong);
  }
}


