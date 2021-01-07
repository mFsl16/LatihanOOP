package com.faisal.latihan;

public class Heart extends Organ {

    private Integer rate;

    public Heart(String name, String healtCondition, int rate) {
        super(name, healtCondition);
        this.rate = rate;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Kondisi : " + this.getHealtCondition());
        System.out.println("Detak Jantung : " + this.rate);
    }

    public int getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
