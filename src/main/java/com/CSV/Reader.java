package com.CSV;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.LinkedList;
import java.util.Arrays;
import java.io.FileReader;



public class Reader {
    private final LinkedList<Employee> employees = new LinkedList<>();
    private final LinkedList<Subdivision> subdivisions = new LinkedList<>();
    private int id;

    public Reader(String cvgFilePath) throws FileNotFoundException {
        CSVReader reader = new CSVReader(new FileReader(cvgFilePath));
        String[] nextLine;
        try{
        while ((nextLine = reader.readNext()) != null) {
            employees.add(getEmployee(Arrays.toString(nextLine)));
        }}catch (Exception e){
            e.printStackTrace();
        }
    }

    private Employee getEmployee(String str){
        int i = 0;
        var arrStr = str.replace("[", "").replace("]","").split(";");

        if(!hasName(arrStr[i+4])){
           subdivisions.add(new Subdivision(arrStr[i+4], ++id));
        }


        return new Employee(Integer.parseInt(arrStr[i]),//id
                arrStr[i+1],//name
                arrStr[i+2],//gender
                arrStr[i+3],//birthday
                getSubdivisionFromList(arrStr[i+4]),
                Integer.parseInt(arrStr[i+5])); //salary

    }

    private Subdivision getSubdivisionFromList(String name){
        for (Subdivision s: subdivisions) {
            if (s.getName().equals(name)){
                return s;
            }
        }
        return new Subdivision();
    }

    private boolean hasName(String name){
        for (Subdivision s : subdivisions)
            if (s.getName().equals(name))
                return true;
        return false;
    }

    public void S(){
        for (Subdivision subdivision : subdivisions) {
            System.out.println("Id организации: " + subdivision.getId());
            System.out.println("Имя организации: " + subdivision.getName() + "\n");
        }
    }

    public void showInfo() {
        for (Employee employee : employees) {
            System.out.println("Id: " + employee.getId());
            System.out.println("Имя: " + employee.getName());
            System.out.println("Дата рождения: " + employee.getDateOfBirthday());
            System.out.println("Пол: " + employee.getGender());
            System.out.println("Зарплата: " + employee.getSalary());
            System.out.println("Id организации: " + employee.getSubdivision().getId());
            System.out.println("Имя организации: " + employee.getSubdivision().getName() + "\n");
        }
    }

}
