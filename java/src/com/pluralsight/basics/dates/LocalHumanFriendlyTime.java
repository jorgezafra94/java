package com.pluralsight.basics.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalHumanFriendlyTime {
    public static void main(String[] args) {
        /*
        Para poder ver fechas y horas de una manera facil
        que el usuario pueda entender, tenemos dos clases:

        * LocalTime -> nos muestra solo Hora
        * LocalDate -> nos muestra solo fecha
        * LocalDateTime -> nos trae fecha y hora

        Estas dos clases al ser locales no tienen uso de
        TIME ZONES
        */

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
    }
}
