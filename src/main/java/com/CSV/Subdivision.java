package com.CSV;

public class Subdivision{
    private int id;
    private String name;

    public Subdivision(String name, int id) {
        this.id = id;
        this.name = name;
    }
    public Subdivision(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
