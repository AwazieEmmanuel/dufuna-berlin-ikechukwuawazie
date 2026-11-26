package com.dufuna.berlin.ikechukwuawazie.service;

import com.dufuna.berlin.ikechukwuawazie.model.LekkiProperty;

public interface LekkiPropertyService {

    void saveProperty(LekkiProperty property);

    LekkiProperty getProperty(Long propertyId);
}