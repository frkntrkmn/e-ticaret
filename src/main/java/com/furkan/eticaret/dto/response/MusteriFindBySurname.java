package com.furkan.eticaret.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MusteriFindBySurname {
    String surname;
    @JsonCreator
    public MusteriFindBySurname(String surname) {
        this.surname = surname;
    }
    public MusteriFindBySurname() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
