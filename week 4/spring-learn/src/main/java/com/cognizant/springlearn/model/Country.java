package com.cognizant.springlearn.model;

public class Country {

    private String code;
    private String name;

    // Constructor
    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter for code
    public String getCode() {
        return code;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // toString method (optional, useful for logging)
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
