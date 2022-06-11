package com.singleton;

public class Logger {

    private static Logger logger;  //static as can't add non static variable in static method

    private Logger(){

    }

    public static Logger getInstance() { // static as to invoke without creating object
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
