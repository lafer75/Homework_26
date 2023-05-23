package org.example.builder;

public class Car {
    private String engine;
    private String wheels;
    private String body;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void printDetails() {
        System.out.println("Двигун: " + engine);
        System.out.println("Колеса: " + wheels);
        System.out.println("Кузов: " + body);
    }
}

