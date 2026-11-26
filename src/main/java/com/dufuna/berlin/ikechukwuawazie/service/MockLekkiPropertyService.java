package com.dufuna.berlin.ikechukwuawazie.service;

import com.dufuna.berlin.ikechukwuawazie.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty(Long propertyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}