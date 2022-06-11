package com.factory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = inputScan.nextDouble();

        System.out.println("Enter second number");
        double num2 = inputScan.nextDouble();

        System.out.println("Enter operation like add,subtract,divide or multiply");
        String operation = inputScan.next();

        CalculateFactory factory = new CalculateFactory(); //will return required obj based on type given
        Calculate obj = factory.getCalculation(operation);
        obj.calculate(num1,num2);

    }
}
