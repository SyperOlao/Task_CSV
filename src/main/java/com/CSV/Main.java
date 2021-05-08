package com.CSV;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Reader program = new Reader("src/main/java/foreign_names.csv");
        program.showInfo();
        //program.S();
    }
}
