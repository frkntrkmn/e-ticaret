package com.furkan.eticaret.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class AdminFindAllDto {
    long id;
    String name;
    String surname;

    @JsonCreator
    public AdminFindAllDto(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public AdminFindAllDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
