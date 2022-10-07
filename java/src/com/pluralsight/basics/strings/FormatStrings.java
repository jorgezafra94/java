package com.pluralsight.basics.strings;

public class FormatStrings {
    public static void main(String[] args) {
        /*
        El String.format es otra forma de crear Strings, de hecho es la que mas se
        usa hoy en dia en la industria

        Este utiliza algo llamado specifiers que son:
        %s -> String
        %d -> decimal
        %f -> float
        %e -> exponencial
        %x -> hexadecimal
        */

        String s1 = String.format("hola como estas %s", "jorge");
        System.out.println(s1);

        String s2 = String.format("%s, tu numero es %d, y tienes este monto %f", "jorge", 123, 23.09f);
        System.out.println(s2);

        /*
        Flags

        # -> muestra el resulta en base por ejemplo en hexa lo muesta 0x20 en vez de 20
        numero -> padding
        0 -> rellenar con zeros
        , -> mostrar numero con separacion de miles, millones, etc
        space -> nos cuadra un espacio cuando el numero es positivo, si es numero negativo no agrega espacio
        + -> muestra el signo positivo
        ( -> encierra los numeros negativos

        */
        System.out.println("");
        System.out.println("numero Normal");
        s1 = String.format("%d", 123);
        s2 = String.format("%d", -456);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("");
        System.out.println("Flag #");
        s1 = String.format("%x", 123);
        s2 = String.format("%#x",123);
        System.out.println(s1);
        System.out.println("ya con base " + s2);

        System.out.println("");
        System.out.println("Flag de padding");
        s1 = String.format("%d", 123);
        s2 = String.format("%6d",123);
        System.out.println(s1);
        System.out.println(s2 + " deja los espacios luego del igual");

        System.out.println("");
        System.out.println("Flag de llenar con zeros mas padding para entender");
        s1 = String.format("%d", 123);
        s2 = String.format("%06d",123);
        System.out.println(s1);
        System.out.println(s2 + " deja los espacios luego del igual y rellena con ceros" );

        System.out.println("");
        System.out.println("Flag de separar por miles millones, etc");
        s1 = String.format("%d", 123456789);
        s2 = String.format("%,d",123456789);
        System.out.println(s1);
        System.out.println(s2 + " separacion de miles, millones, etc");

        System.out.println("");
        System.out.println("Flag de espacio");
        s1 = String.format("% d", 123456789);
        s2 = String.format("% d",-123456789);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("");
        System.out.println("Flag de +");
        s1 = String.format("%+d", 123456789);
        s2 = String.format("%+d",-123456789);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("");
        System.out.println("Flag de (");
        s1 = String.format("%(d", 123456789);
        s2 = String.format("%(d",-123456789);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("");
        System.out.println("Flag de ( mas espacio para alinear");
        s1 = String.format("%( d", 123456789);
        s2 = String.format("%( d",-123456789);
        System.out.println(s1);
        System.out.println(s2);

        /*
        hay otros flags de posicion y de misma configuracion

        $ -> nos permite escoger que valor usar de los parametros que entran en el String.format
        < -> usamos la misma configuracion que el specifier anterior

        */
        System.out.println("");
        System.out.println("Flag $ para escoger argumentos");
        s1 = String.format("%s, %s, %s", "hello", "deja", "el show");
        System.out.println(s1);
        s2 = String.format("%2$s, %3$s, %1$s", "hello", "deja", "el show");
        System.out.println(s2);

        System.out.println("");
        System.out.println("Flag < para usar config previa");
        s1 = String.format("%2$s, %3$s, %1$s", "hello", "deja", "el show");
        System.out.println(s1);
        s2 = String.format("%2$s, %<s, %3$s", "hello", "deja", "el show");
        System.out.println(s2);
    }
}
