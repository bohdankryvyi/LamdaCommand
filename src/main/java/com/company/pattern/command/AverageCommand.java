package com.company.pattern.command;

public class AverageCommand implements Command {

    @Override
    public int calculate(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
