package com.company;

public class ChocolateCake extends Cake {
    public ChocolateCake() {
        super("This is Chocolate Cake");
    }

    @Override
    public void madeCake() {
        System.out.println(this.type);
        this.cream.fill();
    }
}