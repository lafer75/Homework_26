package org.example.strategy;
public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        method.setStrategy(new Rectangle());
        double one = method.countByStrategy(2.2, 4);
        System.out.println(one);

        method.setStrategy(new Triangle());
        double two = method.countByStrategy(6,6);
        System.out.println(two);
    }
}
