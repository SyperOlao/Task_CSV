package com.SyperOlao;

public class Subdivision {
    private static long id;
    private String name;

    public Subdivision(String name) {
        id = id++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
