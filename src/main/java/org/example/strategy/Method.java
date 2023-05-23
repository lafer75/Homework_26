package org.example.strategy;

public class Method {

    private CountSquare countSquare;

    public void setStrategy(CountSquare countSquare) {
        this.countSquare = countSquare;
    }

    public double countByStrategy(double one, double two) {
        return countSquare.count(one, two);
    }
}
