package primitivos;

public class PrimitiveChar {
  public static void main(String[] args) {
    /*
     * los char representan un unico caracter y siempre se
     * deben usar con comillas simples
     *
     * estos estan basados con Unicode uft-16
     *
     * valor por defecto ''
     */

    // para los caracteres se deben usar con comilla simple
    char character = 'a';
    System.out.println("mi caracter " + character);

    // tambien podemos tener caracteres de forma unicode
    char unicode = '\u0040';
    System.out.println("caracter con unicode " + unicode);

    // tambien los enteros los podemos pasar a char debido al codigo Ascii
    char entero = 64;
    System.out.println("caracter desde un entero " + entero);

    // caracteres especiales
    char backSpace = '\b';
    char tab = '\t';
    char newLine = '\n';
  }
}
