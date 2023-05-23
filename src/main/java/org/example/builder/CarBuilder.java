package org.example.builder;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder setWheels(String wheels) {
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder setBody(String body) {
        car.setBody(body);
        return this;
    }

    public Car build() {
        return car;
    }
}
