package com.example.helloandroid.w9examples;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roxanan on 15,May,2019
 */
public class Person {
    @SerializedName("name")
    private String name;
    @SerializedName("surname")
    private String surname;
    @SerializedName("address")
    private String homeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
