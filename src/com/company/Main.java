package com.company;

public class Main {

    public static void main(String[] args) {
        Cake cake= new ChocolateCake();
        Cream cream=new Sundae();
        cake.setCream(cream);
        cake.madeCake();
    }
}
