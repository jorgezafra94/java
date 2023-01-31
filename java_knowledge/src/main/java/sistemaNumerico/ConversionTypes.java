package sistemaNumerico;

public class ConversionTypes {
  public static void main(String[] args) {

    /*-------------------- String to Primitive ----------------------------*/
    String numeroStr = "50";

    int numeroInt = Integer.parseInt(numeroStr);
    System.out.println("numeroInt = " + numeroInt);

    numeroStr = "9893.34";
    double realDouble = Double.parseDouble(numeroStr);
    System.out.println("realDouble = " + realDouble);

    numeroStr = "9893.34e-3";
    realDouble = Double.parseDouble(numeroStr);
    System.out.println("realDouble = " + realDouble);

    String logicStr = "true";
    boolean logicBoolean = Boolean.parseBoolean(logicStr);
    System.out.println("logicBoolean = " + logicBoolean);

    /*--------------------------- Primitive to String -------------------------*/
    int otroNumInt = 100;
    String otroNumIntStr = String.valueOf(otroNumInt);
    System.out.println("otroNumIntStr = " + otroNumIntStr);

    double otroDouble = 234.98;
    String otroDoubleStr = String.valueOf(otroDouble);
    System.out.println("otroDoublestr = " + otroDoubleStr);

    boolean b = true;
    String booleanStr = String.valueOf(b);
    System.out.println("booleanStr = " + booleanStr);

    /*--------------------------- Primitive to other Primitive -------------------------*/
    /*
     * para pasar de algunos primitivos a otros es necesario realizar un cast
     * en estos casos puede llegar a perderse informacion por ejemplo de pasar
     * de un entero a un short, ya que en un short no cabe completamente un entero
     * por eso se va a perder la info
     *
     * */
    int i = 10000;
    short s = (short) i; // esto es un casteo
    double d = i; // aqui no se necesita cast ya que en un double cabe un entero
    long l = i;

    System.out.println("entero = " + i);
    System.out.println("entero a short = " + s);
    System.out.println("entero a double = " + d);
    System.out.println("entero a long = " + l);

    /*
     * Tener en cuenta que si el entero se pasa del valor maximo del short
     * en este caso, el valor que tomará el short será un valor negativo
     * ejemplo
     * i = 32767
     * s -> - 22768
     * igual en ambos caso es necesario realizar el casteo
     * */
  }
}
