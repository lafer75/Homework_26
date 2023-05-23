package org.example.factory;

class Cabinet extends Furniture {
    @Override
    public void create() {
        System.out.println("Створено шафу");
    }
}
