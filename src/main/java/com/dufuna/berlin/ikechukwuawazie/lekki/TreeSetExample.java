
package com.dufuna.berlin.ikechukwuawazie.lekki;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> propertyTypes = new TreeSet<>();

        propertyTypes.add("Duplex");
        propertyTypes.add("Bungalow");
        propertyTypes.add("Apartment");
        propertyTypes.add("Duplex");
        propertyTypes.add("Penthouse");

        System.out.println("Property types: " + propertyTypes);

        System.out.println("Total unique property types: " + propertyTypes.size());

        System.out.println("First property type: " + propertyTypes.first());

        System.out.println("Last property type: " + propertyTypes.last());

        propertyTypes.remove("Duplex");

        System.out.println("After removing Duplex: " + propertyTypes);
    }
}
