package com.memorynotfound.kafka;

public class Baar extends base {

    private String  firstname;

    public Baar() {
    }


    public Baar(String firstname)
    {
        this.firstname=firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    @Override
    public String toString() {
        return "Baar{" +
                "firstname='" + firstname + '\'' +
                '}';
    }
}
