
package com.dufuna.berlin.ikechukwuawazie.lekki;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> propertyTypes = new HashSet<>();

        propertyTypes.add("Duplex");
        propertyTypes.add("Bungalow");
        propertyTypes.add("Apartment");
        propertyTypes.add("Duplex");

        System.out.println("Property types: " + propertyTypes);

        System.out.println("Total unique property types: " + propertyTypes.size());

        System.out.println("Does Duplex exist? " + propertyTypes.contains("Duplex"));

        propertyTypes.remove("Bungalow");

        System.out.println("After removing Bungalow: " + propertyTypes);
    }
}
