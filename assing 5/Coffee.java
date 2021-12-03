package com.cafe.menu;

public class Coffee extends Beverage {
    private int defaultShot;

    public Coffee (String name_in) {
        super(name_in);
        basePrice = 4100;
        price = basePrice;
        size = 0;
    }
    public boolean setSize(int size){
        this.size = size;
        this.price = basePrice + 500*this.size;
        return true;
    }
}
