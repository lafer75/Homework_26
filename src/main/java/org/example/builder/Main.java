package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setEngine("V6")
                .setWheels("17-inch")
                .setBody("Sedan")
                .build();

        car.printDetails();
    }
}
