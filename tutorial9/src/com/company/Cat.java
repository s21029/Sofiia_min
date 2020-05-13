package com.company;

public class Cat extends Feline {
    @Override
    public void make_noise(){
        super.make_noise();
        super.Noise = "mur mur";
    }
}
