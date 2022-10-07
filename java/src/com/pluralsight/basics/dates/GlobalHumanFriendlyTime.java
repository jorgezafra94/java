package com.pluralsight.basics.dates;

import java.time.ZonedDateTime;

public class GlobalHumanFriendlyTime {
    public static void main(String[] args) {
        /*
        De esta forma podemos usar TIME ZONES
        ademas de esto es friendly con el usuario

        la clase que se usa

        * ZonedDateTime class

        */

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
