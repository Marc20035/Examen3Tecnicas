package org.example.Decorator;

public class ProgramDecorator implements Program {
    protected Program decoratedProgram;

    public ProgramDecorator(Program decoratedProgram) {
        this.decoratedProgram = decoratedProgram;
    }

    public void execute() {
        decoratedProgram.execute();
    }
}
