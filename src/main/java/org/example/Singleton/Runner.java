package org.example.Singleton;

import org.example.Decorator.ComportamientoAdicional;
import org.example.Decorator.Program;
import org.example.Strategy.ConcreteStrategy.CountDown;
import org.example.Strategy.ConcreteStrategy.CountUp;
import org.example.Strategy.Reverser;

public class Runner {
    private static Runner instance;

    private Runner() {
    }

    public static Runner getInstance() {
        if (instance == null) {
            instance = new Runner();
        }
        return instance;
    }

    public void runProgram(Program program) {
        program.execute();
    }
    public static void mostrarConsola(){
        Runner.getInstance().runProgram(new ComportamientoAdicional(new Reverser(new CountUp())));
        Runner.getInstance().runProgram(new ComportamientoAdicional(new Reverser(new CountDown())));
    }
}