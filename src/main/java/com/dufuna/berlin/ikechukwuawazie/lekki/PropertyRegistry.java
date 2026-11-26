
package com.dufuna.berlin.ikechukwuawazie.lekki;

import java.util.HashMap;

public class PropertyRegistry {

    public static void main(String[] args) {

        HashMap<Long, String> properties = new HashMap<>();

        properties.put(1L, "Lekki Apartment");
        properties.put(2L, "Ikoyi Duplex");
        properties.put(3L, "Victoria Island Flat");

        System.out.println("All properties: " + properties);

        System.out.println("Property with ID 2: " + properties.get(2L));

        System.out.println("Total properties: " + properties.size());

        System.out.println("Does property ID 1 exist? " + properties.containsKey(1L));

        properties.remove(3L);

        System.out.println("After removing property ID 3: " + properties);
    }
}

