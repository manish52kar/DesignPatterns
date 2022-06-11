package com.decorator;

public abstract class Coffee {

    public String description = "";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
