package com.dufuna.berlin.ikechukwuawazie.lekki;

import com.dufuna.berlin.ikechukwuawazie.model.LekkiProperty;
import com.dufuna.berlin.ikechukwuawazie.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();
        property.setPropertyId(1L);

        MockLekkiPropertyService propertyService = new MockLekkiPropertyService();

        propertyService.saveProperty(property);
        propertyService.getProperty(property.getPropertyId());
    }
}