package org.example.Strategy.ConcreteStrategy;

import org.example.Strategy.Strategy;

public class CountDown implements Strategy {
    public String execute() {
        System.out.println("Contar hacia abajo");
        return "para";
    }
}