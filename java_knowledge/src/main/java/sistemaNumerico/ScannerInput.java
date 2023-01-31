package sistemaNumerico;

import java.util.Scanner;

public class ScannerInput {

  public static void main(String[] args) {
    // para poder crear la instancia debemos usar System.in
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    String numeroStr = scanner.nextLine();
    int numeroDecimal = 0;

    try {
      numeroDecimal = Integer.parseInt(numeroStr);
    } catch (NumberFormatException ex) {
      System.out.println("Error el numero ingresado no es es entero");
    }

    System.out.println("el numero ingresado es " + numeroDecimal);
    System.out.println("el numero en binario es " + Integer.toBinaryString(numeroDecimal));
    System.out.println("el numero en octal es " + Integer.toOctalString(numeroDecimal));
    System.out.println("el numero en hexa es " + Integer.toHexString(numeroDecimal));
  }
}
