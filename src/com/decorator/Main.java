package com.decorator;

public class Main {

    public static void main(String[] args) {

        Coffee espresso = new Espresso();
        printCoffee(espresso);

        espresso = new WithMilk(espresso);
        printCoffee(espresso);

        espresso = new WithSugar(espresso);
        espresso = new WithSugar(espresso);
        printCoffee(espresso);

    }

    private static void printCoffee(Coffee coffee) {
        System.out.println(coffee.getDescription() + " of $"+coffee.cost());
    }
}
