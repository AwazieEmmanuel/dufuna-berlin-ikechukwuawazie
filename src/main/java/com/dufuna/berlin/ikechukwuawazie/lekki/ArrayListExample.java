
package com.dufuna.berlin.ikechukwuawazie.lekki;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> propertyNames = new ArrayList<>();

        propertyNames.add("Lekki Apartment");
        propertyNames.add("Ikoyi Duplex");
        propertyNames.add("Victoria Island Flat");

        System.out.println(propertyNames);
        System.out.println(propertyNames.get(0));

        propertyNames.remove(1);
        System.out.println(propertyNames);

        propertyNames.set(1, "Ajah Luxury Apartment");
        System.out.println(propertyNames);

        System.out.println("Total properties: " + propertyNames.size());
    }
}
