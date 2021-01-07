package com.faisal.latihan;

public class Eyes extends Organ {

    private String color;
    private  boolean isOpen;

    public Eyes(String name, String healtCondition, String color, boolean isOpen) {
        super(name, healtCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetail() {
        super.getDetail();

        System.out.println("Color          : " + this.color);
        System.out.println("eyes Condition : " + this.getHealtCondition());
    }

    public void eyesDetail () {
        if( this.isOpen() == true) {
            System.out.println("Mata di buka");
        } else {
            System.out.println("Mata di tutup");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

