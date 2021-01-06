package com.faisal.latihan;

public class Patient {

    private String name;
    private String age;
    private Eyes eyes;
    private Heart heart;
    private Skin skin;
    private Stomatch stomatch;

    public Patient(String name, String age, Eyes eyes, Heart heart, Skin skin, Stomatch stomatch) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.heart = heart;
        this.skin = skin;
        this.stomatch = stomatch;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public Heart getHeart() {
        return heart;
    }

    public Skin getSkin() {
        return skin;
    }

    public Stomatch getStomatch() {
        return stomatch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public void setStomatch(Stomatch stomatch) {
        this.stomatch = stomatch;
    }
}
