package org.example.factory;

class Chair extends Furniture {
    @Override
    public void create() {
        System.out.println("Створено стілець");
    }
}
