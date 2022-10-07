package com.pluralsight.basics.dates;

import java.time.Instant;

public class EventTrackTime {
    public static void main(String[] args) {
        /*
        Para monitorear eventos tipo para saber cuanto
        se demora un proceso, para ello debemos usar:

        * Instant class

        */

        Instant instant = Instant.now();
        checkRelationShip(instant);
    }

    public static void checkRelationShip(Instant otherInstant) {
        Instant now = Instant.now();
        String answer;
        if (otherInstant.compareTo(now) > 0) {
            answer = "otherInstant is in the future";
        } else if (otherInstant.compareTo(now) < 0){
            answer = "otherInstant is in the past";
        } else {
            answer = "the moment is now";
        }

        System.out.println(answer);
    }
}
