package com.company;

public abstract class Cake {
    protected String type;
    protected Cream cream;

    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Cake(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void madeCake();

}

