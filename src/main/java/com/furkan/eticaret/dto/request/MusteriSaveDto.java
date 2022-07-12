package com.furkan.eticaret.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MusteriSaveDto {
    @Size(min = 3,message = "enter min 3 characters for your name")
    @NotNull(message = "enter the your name")
    String name;
    @Size(min = 3,message = "enter min 3 characters for your surname")
    @NotNull(message = "enter the your surname")
    String surname;

    @NotNull(message = "enter your mail address")
    String email;


    int number;

    @JsonCreator
    public MusteriSaveDto(int number,String name, String surname,  String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int Number) {
        this.number = number;
    }
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



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
