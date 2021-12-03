package com.cafe.order;

import com.cafe.menu.*;

public class OrderItem {
    Beverage beverage;
    int quantity;
    String size[] = {"TALL","GRANDE","VENTI"};

    OrderItem (Beverage beverage_in, int quantity_in) {
        beverage = beverage_in;
        quantity = quantity_in;
    }

    public String toString(){
        String msg = String.format("[ name=%s, price=%d, size=%s, quantity=%d ]",
                beverage.name,beverage.price,size[beverage.size],quantity);
        return msg;
    }

    public int cost(){
        return beverage.price;
    }
}
