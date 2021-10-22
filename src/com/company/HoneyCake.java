package com.company;

public class HoneyCake extends Cake{
    public HoneyCake() {
        super("This is Honey Cake");
    }

    @Override
    public void madeCake() {
        System.out.println(this.type);
        this.cream.fill();
    }
}
