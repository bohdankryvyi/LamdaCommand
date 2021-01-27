package com.company;

import com.company.pattern.command.Command;
import com.company.pattern.command.Commander;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Command command = (a, b, c) -> Math.max(a, Math.max(b, c));
        System.out.println(command.calculate(3,5,7));

        command = (a, b, c) -> (a + b + c) / 3;
        System.out.println(command.calculate(3,5,7));

        patternCommand();
    }

    public static void patternCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please set first INT value: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Please set second INT value: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Please set third INT value: ");
        int c = Integer.parseInt(scanner.nextLine());

        System.out.print("Input operation you want(Average,Max,Min,Sum) ");
        String operation = scanner.nextLine();

        Commander commander = new Commander(a, b, c, operation);
        commander.command();
    }

}
