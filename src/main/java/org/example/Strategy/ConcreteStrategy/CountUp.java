package org.example.Strategy.ConcreteStrategy;

import org.example.Strategy.Strategy;

public class CountUp implements Strategy {
    public String execute() {
        System.out.println("Contar hacia arriba");
        return "nunca";
    }
}
