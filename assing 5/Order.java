package com.cafe.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static List<OrderItem> items = new ArrayList<OrderItem>();

    public static void add(OrderItem item){
        items.add(item);
    }
    public static int cost(){
        int sum =0;
        for( OrderItem i : items){
            sum += i.cost()*i.quantity;
        }
        return (sum);
    }
    public static boolean setSize(String name, String size){
        for(OrderItem i : items){
            if(name.equals(i.beverage.name)){
                if(size.equals("TALL")) {
                    return i.beverage.setSize(0);
                } else if(size.equals("GRANDE")) {
                    return i.beverage.setSize(1);
                } else if(size.equals("VENTI")) {
                    return i.beverage.setSize(2);
                } else return false;
            }
        }
        return false;
    }
    public static void print(){
        for(OrderItem i : items){
            System.out.println(i);
        }
        System.out.printf("TOTAL: %,d\n",cost());
    }
}
