package com.faisal.latihan;

public class Organ {

    private String name;
    private String healtCondition;

    public Organ(String name, String healtCondition) {
        this.name = name;
        this.healtCondition = healtCondition;
    }

    public void  getDetail () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealtCondition() {
        return healtCondition;
    }

    public void setHealtCondition(String healtCondition) {
        this.healtCondition = healtCondition;
    }
}
