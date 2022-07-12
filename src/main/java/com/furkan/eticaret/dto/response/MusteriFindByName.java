package com.furkan.eticaret.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MusteriFindByName {
    String name;
    @JsonCreator
    public MusteriFindByName(String name) {
        this.name = name;
    }

    public MusteriFindByName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
