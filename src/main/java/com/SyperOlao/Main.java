package com.SyperOlao;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Program program = new Program("src/main/java/foreign_names.csv");
        program.showInfo();
        System.out.println("Считываение в лист завершено!");
    }
}
