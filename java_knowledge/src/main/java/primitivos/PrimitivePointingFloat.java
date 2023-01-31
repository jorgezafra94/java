package primitivos;

public class PrimitivePointingFloat {
  public static void main(String[] args) {
    /*
    * estos primitivos de punto flotante son dos:
    * float(f)(32 bits), double(d o no es necesario agregarle la letra)(64 bits)
    *
    * valor por defecto es 0.0
    */

    /*------------------------------- FLOAT ---------------------------------**/
    // si enviamos un entero, va a imprimir el entero .0 ejemplo 1.0
    float myFloat = 1;
    System.out.println("mi flotante " + myFloat);

    // si queremos agregarle un decimal SI o SI toca agregarle f al final;
    myFloat = 1.0f;
    System.out.println("mi flotante " + myFloat);

    myFloat = 2120f;
    System.out.println("mi flotante " + myFloat);

    // podemos tambien escribir un flotante con notacion cientifica
    myFloat = 2.12e3f;
    System.out.println("mi flotante " + myFloat);

    float maxFloat = Float.MAX_VALUE;
    float minFloat = Float.MIN_VALUE;
    float maxExponent = Float.MAX_EXPONENT;
    float minExponent = Float.MIN_EXPONENT;

    System.out.println("maximo valor de un float " + maxFloat);
    System.out.println("minimo valor de un float " + minFloat);
    System.out.println("maximo valor del exponente de un float " + maxExponent);
    System.out.println("minimo valor del exponente de un float " + minExponent);

    /*------------------------------- DOUBLE ---------------------------------**/
    // si enviamos un entero, va a imprimir el entero .0 ejemplo 1.0
    double myDouble = 1;
    System.out.println("mi double " + myDouble);

    // si queremos agregarle un decimal SE PUEDE agregar d al final pero no es necesario lo toma por defecto;
    myDouble = 1.0f;
    System.out.println("mi double " + myDouble);

    myDouble = 2120d;
    System.out.println("mi double " + myDouble);

    // podemos tambien escribir un flotante con notacion cientifica
    myDouble = 2.12e3;
    System.out.println("mi double " + myDouble);

    double maxDouble = Double.MAX_VALUE;
    double minDouble = Double.MIN_VALUE;
    double maxDExponent = Double.MAX_EXPONENT;
    double minDExponent = Double.MIN_EXPONENT;

    System.out.println("maximo valor de un double " + maxDouble);
    System.out.println("minimo valor de un double " + minDouble);
    System.out.println("maximo valor del exponente de un double " + maxDExponent);
    System.out.println("minimo valor del exponente de un double " + minDExponent);
  }
}
