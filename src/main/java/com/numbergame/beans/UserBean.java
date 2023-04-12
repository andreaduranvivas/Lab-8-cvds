package com.numbergame.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class UserBean implements Serializable {
    private String name;
    public UserBean() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
