package org.example.Strategy;

import org.example.Decorator.Program;

public class Reverser implements Program {
    private Strategy strategy;

    public Reverser(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        String result = strategy.execute();
        if (result.equals("para")) {
            System.out.println("Ejecutar bucle infinito");
        } else {
            System.out.println("Terminar inmediatamente");
        }
    }
}
