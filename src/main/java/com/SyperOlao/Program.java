package com.SyperOlao;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.FileReader;
import java.util.List;


public class Program {
    private LinkedList<Employee> employees = new LinkedList<Employee>();

/*
   public Program(String cvgFilePath){
      try (InputStream in = getClass().getClassLoader().getResourceAsStream(cvgFilePath)
          CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ";") {
             if(reader ==null)
              {
                  throw new FileNotFoundException(cvgFilePath);
              }

             String[] nextLine;
             while((nextLine =reader.readNext()!=null))
             {

             }

      } catch (IOException e) {
          e.printStackTrace();
      }
   }
*/
    //foreign_names
    public Program(String cvgFilePath) throws FileNotFoundException {

        CSVReader reader = new CSVReader(new FileReader(cvgFilePath));

        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        try{
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));
            }
        }}catch (Exception e){
            e.printStackTrace();
        }
    }

    public void showInfo() {
        for (Employee e : employees) {
            System.out.println("Id: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Date of birthday: " + e.dateOfBirthday);
            System.out.println("Gender: " + e.gender);
            System.out.println("Salary: " + e.salary);
            System.out.println("Subdivision id: " + e.subdivision.id);
            System.out.println("Subdivision name: " + e.subdivision.name);
        }
    }
}
