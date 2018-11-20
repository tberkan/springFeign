package com.endava.springHomeworkFeign;

public class Phone {

    private long id;

    private String company;

    private String model;

    public Phone() {
    }

    public Phone(long id, String company, String model) {
        this.id = id;
        this.company = company;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
