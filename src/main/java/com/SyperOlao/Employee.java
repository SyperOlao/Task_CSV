package com.SyperOlao;

public class Employee {
    int id;
    String name;
    String gender;
    Subdivision subdivision;
    int salary;
    String dateOfBirthday;

    public Employee(int id, String name, String gender, String dateOfBirthday, Subdivision subdivision, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.subdivision = subdivision;
        this.salary = salary;
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Subdivision getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

}
