package com.example.user_registration;

import java.io.Serializable;

public class User {
    private String name;
    private boolean isVegetarian;

    public User(String name, boolean isVegetarian) {
        this.name = name;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
