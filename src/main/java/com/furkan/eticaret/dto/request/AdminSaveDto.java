package com.furkan.eticaret.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class AdminSaveDto {
    String name;
    String surname;

    @JsonCreator
    public AdminSaveDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public AdminSaveDto() {
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
}
