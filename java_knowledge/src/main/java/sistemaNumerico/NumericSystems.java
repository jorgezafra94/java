package sistemaNumerico;

public class NumericSystems {
  public static void main(String[] args) {

    int decimalNumber = 500;
    System.out.println("decimalNumber " + decimalNumber);

    // numero en binario
    String binario = Integer.toBinaryString(decimalNumber);
    System.out.println("decimal to binary " + binario);

    // numero en octal
    String octal = Integer.toOctalString(decimalNumber);
    System.out.println("decimal to octal " + octal);

    // numero en hexa
    String hexa = Integer.toHexString(decimalNumber);
    System.out.println("decimal to hex " + hexa);

    // tambien podemos setear directamente un binario a un int debe empezar con 0b
    int newNum = 0b111110100;
    System.out.println("binary to decimal " + newNum);

    // se puede pasar de un octal a un int pero debe empezar con 0
    newNum = 0764;
    System.out.println("octal to decimal " + newNum);

    // se puede pasar de hexa a un int pero debe empezar con 0x
    newNum = 0x1f4;
    System.out.println("hexa to decimal " + newNum);
  }
}
