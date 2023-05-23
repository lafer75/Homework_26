package org.example.strategy;

public class Rectangle implements CountSquare{
    @Override
    public double count(double sideA, double sideB) {
        return sideA * sideB;
    }
}
