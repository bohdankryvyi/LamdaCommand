package com.company.pattern.command;

import java.util.Scanner;
import java.util.function.Function;

public class Commander {

    int a, b, c;

    String operation;

    public Commander(int a, int b, int c, String operation) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.operation = operation;
    }

    public void command() {

        // command object
        if (operation.equals("Average")) {
            Command averageCommand = new AverageCommand();
            System.out.println(averageCommand.calculate(a, b, c));
        }

        // lambda
        if (operation.equals("Max")) {
            Command maxCommand = (x, y, z) -> Math.max(x, Math.max(y, z));
            System.out.println(maxCommand.calculate(a, b, c));
        }

        // anonymous
        if (operation.equals("Sum")) {
            Command sumCommand = new Command() {
                @Override
                public int calculate(int a, int b, int c) {
                    return a + b + c;
                }
            };
            System.out.println(sumCommand.calculate(a,b,c));
        }

        // method reference
        if (operation.equals("Min")) {
            MinCommand minCommand = new MinCommand(a, b, c);
            Function<MinCommand, Integer> function = MinCommand::calculate;
            System.out.println(function.apply(minCommand));
        }

    }


}
