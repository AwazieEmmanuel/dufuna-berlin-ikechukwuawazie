
package com.dufuna.berlin.ikechukwuawazie.lekki;

public class PropertyUtilities {

    public static void main(String[] args) {

        // 1. String class
        String propertyName = "Lekki Apartment";

        System.out.println("Property name: " + propertyName);
        System.out.println("Name length: " + propertyName.length());
        System.out.println("Uppercase name: " + propertyName.toUpperCase());

        // 2. Object class
        Object property = propertyName;

        System.out.println("Object value: " + property);
        System.out.println("Object class: " + property.getClass().getSimpleName());

        // 3. Exception class
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }

        // 4. System class
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Program completed successfully.");
    }
}
