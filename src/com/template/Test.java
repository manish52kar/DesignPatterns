package com.template;

public class Test {

    public static void main(String[] args) {

        //ExcelFile excelFile = new ExcelFile();
        DataProcessor obj = new ExcelFile();
        obj.execute();

        obj = new TextFile();
        obj.execute();
    }
}
