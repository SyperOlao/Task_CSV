package com.SyperOlao;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.LinkedList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.io.FileReader;
import java.util.List;


public class Program {
    private LinkedList<Employee> employees = new LinkedList<Employee>();

    //foreign_names
    public Program(String cvgFilePath) throws FileNotFoundException {

        CSVReader reader = new CSVReader(new FileReader(cvgFilePath));

        String[] nextLine;
        try{
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                employees.add(getEmployee(Arrays.toString(nextLine)));
            }
        }}catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Employee getEmployee(String str){
        int i = 0;
        var arrStr = str.replace("[", "").replace("]","").split(";");

        return new Employee(Integer.parseInt(arrStr[i]),//id
                arrStr[i+1],//name
                arrStr[i+2],//gender
                arrStr[i+3],//br
                new Subdivision(arrStr[i+4]),//sub
                Integer.parseInt(arrStr[i+5]));
    }

    public void showInfo() {
        for (Employee e : employees) {
            System.out.println("Id: " + e.getId());
            System.out.println("Name: " + e.getName());
            System.out.println("Date of birthday: " + e.getDateOfBirthday());
            System.out.println("Gender: " + e.getGender());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Subdivision id: " + e.getSubdivision().getId());
            System.out.println("Subdivision name: " + e.getSubdivision().getName() + "\n");
        }
    }

}
