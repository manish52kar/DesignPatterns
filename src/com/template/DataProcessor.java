package com.template;

public abstract class DataProcessor {

    public void execute(){
        readData();
        processData();
        saveData();
    }

    public abstract void readData();

    public abstract void processData();

    private void saveData() {
        System.out.println("Save File");
    }
}
