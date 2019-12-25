package com.memorynotfound.kafka;

public class Baar extends base {

    private String  name;

    public Baar() {
    }


    public Baar(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Baar{" +
                "name='" + name + '\'' +
                '}';
    }
}
