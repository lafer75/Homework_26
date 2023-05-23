package org.example.strategy;

public class Triangle implements CountSquare{
    @Override
    public double count(double triangleHeight, double triangleWidth) {
        return (triangleHeight * triangleWidth / 2);
    }
}
