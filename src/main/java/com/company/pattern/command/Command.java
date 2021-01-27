package com.company.pattern.command;

@FunctionalInterface
public interface Command {

    int calculate(int a, int b, int c);

}
