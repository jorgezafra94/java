package com.pluralsight.basics.conditionals;

public class ConditionalSwitch {
    public static void main(String[] args) {
        /*
        El Switch es como un if, else if, else
        pero mas bonito

        igual no se usa mucho porque esta muy limitado
        solo se puede usar con byte, short, int, long y char

        Tener en cuenta que los cases adentro deben terminar en BREAK
        sino empieza a correr como si fuera un if, por cada condicion

        el default es como el else, si no entra en ningun case, va al default
        obvio tambien podemos crear switch sin default
        */

        int value = 189;

        switch (value) {
            case 9:
                System.out.println("el value es nueve");
                break;
            case 189:
                System.out.println("el value es 189");
                break;
            default:
                System.out.println("otro numero");
        }
    }
}
