package com.company.pattern.command;

public class MinCommand {

    int a, b, c;

    public MinCommand(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculate() {
        return Math.min(a, Math.min(b, c));
    }

}
