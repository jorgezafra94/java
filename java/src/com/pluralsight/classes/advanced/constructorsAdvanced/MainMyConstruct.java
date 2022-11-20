package com.pluralsight.classes.advanced.constructorsAdvanced;

public class MainMyConstruct {
    public static void main(String[] args) {
        MyConstruct m1 = new MyConstruct(20, 40);
        MyConstruct m2 = new MyConstruct(20);

        // Como ya sabemos los valores por defecto se aplican para m2 en el campo de checkedBags
        System.out.println("m1 freeBags " + m1.freeBags + " checkedBags " + m1.checkedBags);
        System.out.println("m2 freeBags " + m2.freeBags + " checkedBags " + m2.checkedBags);
    }
}
