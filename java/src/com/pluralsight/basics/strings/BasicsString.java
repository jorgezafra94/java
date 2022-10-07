package com.pluralsight.basics.strings;

public class BasicsString {
    public static void main(String[] args) {
        /*
        Los String son un tipo de Objeto en Java de echo son de los mas usados
        Estos estan conformados por secuencias de caracteres Unicode UTF-16

        Los Strings son inmutables es decir cada vez que cambiamos algo de un String
        el String resultante es una nueva variable diferente del original

        Los String al ser objetos deben ser igualados con "equals" mas no con ==
        ya que nos generaría un error porque == compara direccion de memoria e equals valor dentro
        de la direccion de memoria
        */

        // declaracion
        String phrase = "hola gente";

        // concatenacion
        String message = phrase + " como van?";

        // igualdad
        boolean sonIguales = "hola gente como van?".equals(message);
        System.out.println(sonIguales);

        /*
        Si queremos usar el == para comparar los Strings debemos usar un metodo
        que ellos tienen que se llama intern()
        */
        String miOtroValor = "hola gente como van?";
        boolean estoNoFunca = miOtroValor == message; // dara siempre false aunque sean iguales los mensajes
        boolean estoSiFunca = miOtroValor.intern() == message.intern(); // este si dará true porq compara contenido
        System.out.println(estoNoFunca + " " + estoSiFunca);
    }
}
