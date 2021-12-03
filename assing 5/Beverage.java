package com.cafe.menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;
    
    public String name;
    public int basePrice;
    public int size;
    public int price;

    Beverage (String name_in){
        name = name_in;
    }
    public boolean setSize(int size){
        this.size = size;
        return true;
    }
}
