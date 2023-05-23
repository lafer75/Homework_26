package org.example.factory;

public class FurnitureFactory {
    public Furniture createFurniture(String type) {
        if (type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else if (type.equalsIgnoreCase("table")) {
            return new Table();
        } else if (type.equalsIgnoreCase("cabinet")) {
            return new Cabinet();
        }
        return null;
    }
}