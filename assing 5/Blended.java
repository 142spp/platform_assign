package com.cafe.menu;

public class Blended extends Beverage {
    private int baseAmount;
    public Blended(String name_in) {
        super(name_in);
        basePrice = 6300;
        size = 1;
        price = basePrice + size*500;
    }
    public boolean setSize(int size){
        if(size == GRANDE){
            this.size = size;
            this.price = basePrice + 500*this.size;
            return true;
        }
        return false;
    }

}
