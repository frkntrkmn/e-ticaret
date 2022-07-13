package com.furkan.eticaret.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MusteriFindAllDto {

    long id;
    String name;
    String surname;
    int number;
    String email;

    @JsonCreator
    public MusteriFindAllDto(String name, String surname, int number, String email) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.id = id;
    }

    public MusteriFindAllDto() {
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
