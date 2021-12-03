package com.cafe.menu;

public class Teavana extends Beverage{
    private int amount;

    public Teavana(String name_in) {
        super(name_in);
        basePrice = 4100;
        price = basePrice;
        size = 0;
    }
    public boolean setSize(int size){
        if(size != GRANDE) {
            this.size = size;
            this.price = basePrice + 500 * this.size;
            return true;
        }
        return false;
    }
}
