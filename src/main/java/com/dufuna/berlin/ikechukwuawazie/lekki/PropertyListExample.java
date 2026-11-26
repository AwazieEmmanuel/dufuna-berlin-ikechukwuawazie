
package com.dufuna.berlin.ikechukwuawazie.lekki;

import com.dufuna.berlin.ikechukwuawazie.model.LekkiProperty;
import java.util.ArrayList;

public class PropertyListExample {

    public static void main(String[] args) {

        ArrayList<LekkiProperty> properties = new ArrayList<>();

        LekkiProperty property1 = new LekkiProperty();
        property1.setPropertyId(1L);
        property1.setAddress("Lekki Phase 1");

        LekkiProperty property2 = new LekkiProperty();
        property2.setPropertyId(2L);
        property2.setAddress("Victoria Island");

        properties.add(property1);
        properties.add(property2);

        System.out.println("Total properties: " + properties.size());

        for (LekkiProperty property : properties) {
            System.out.println(property.getAddress());
        }
    }
}
