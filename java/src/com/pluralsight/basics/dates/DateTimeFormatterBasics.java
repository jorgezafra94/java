package com.pluralsight.basics.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterBasics {
    public static void main(String[] args) {
        /*
        El DateTimeFormatter funciona para poder visualizar
        fechas segun un formato que queramos tipo

        yyyy-MM-ddTHH:mm:ss
        dd-yyyy-MMTmm:ss:HH

        es decir nosotros le damos la forma de como queremos
        ver las fechas
        */

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String formato = "dd/MM/yyyy";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(formato);

        String result = now.format(fmt);
        System.out.println(result);
    }
}
