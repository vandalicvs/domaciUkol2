package com.engeto.du2;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private String dobguest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Guest(String name, String surname, String dobguest) {
        this.name = name;
        this.surname = surname;
        this.dobguest = dobguest;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDobguest() {
        return dobguest;
    }

    public void setDobguest(String dobguest) {
        this.dobguest = dobguest;
    }

    public String getDescription() {
        String description = "Jmeno hosta: " +getName()+" " +getSurname()+ ", datum narozeni:  " +getDobguest();
        return description;
    }

}
