package org.example.Decorator;

public class ComportamientoAdicional extends ProgramDecorator {
    public ComportamientoAdicional(Program decoratedProgram) {
        super(decoratedProgram);
    }

    @Override
    public void execute() {

        decoratedProgram.execute();

    }
}