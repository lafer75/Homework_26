package org.example.factory;

class Table extends Furniture {
    @Override
    public void create() {
        System.out.println("Створено стіл");
    }
}
