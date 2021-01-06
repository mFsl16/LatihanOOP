package com.faisal.latihan;

public class Skin extends Organ {

    private String color;
    private int softness;

    public Skin(String name, String healtCondition, String color, int softness) {
        super(name, healtCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetail() {
        super.getDetail();

        System.out.println("Color : " + this.color);
        System.out.println("Softness : " + this.softness);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
