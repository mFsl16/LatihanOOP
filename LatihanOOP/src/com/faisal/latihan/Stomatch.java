package com.faisal.latihan;

public class Stomatch extends Organ {

    private boolean isEmpty;

    public Stomatch(String name, String healtCondition, boolean isEmpty) {
        super(name, healtCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetail() {
        super.getDetail();

        if (isEmpty) {
            System.out.println("Perut anda kosong.");
        } else {
            System.out.println("Perut anda Kenyang.");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void makan () {
        System.out.println("Anda sedang makan ...");
        this.isEmpty = !this.isEmpty;
    }
}
