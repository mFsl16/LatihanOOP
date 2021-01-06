package com.faisal.latihan;

public class Heart extends Organ {

    private int rate;

    public Heart(String name, String healtCondition, int rate) {
        super(name, healtCondition);
        this.rate = rate;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Heart rate : " + this.rate);
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
