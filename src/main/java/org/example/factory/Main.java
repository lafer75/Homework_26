package org.example.factory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.createFurniture("chair");
        chair.create();  // Створено стілець

        Furniture table = factory.createFurniture("table");
        table.create();  // Створено стіл

        Furniture cabinet = factory.createFurniture("cabinet");
        cabinet.create();  // Створено шафу
    }
}
