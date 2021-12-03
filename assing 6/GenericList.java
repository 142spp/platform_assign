package edu.pnu.collection;

import java.util.Arrays;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList (){
        data = new Object[DEFAULT_SIZE];
    }

    public GenericList (T player){

    }

    public int size(){
        return size;
    }

    public void add(T newPlayer){
        Object[] Copy = new Object[size+1];
        Copy[size] = newPlayer;
        System.arraycopy(data, 0, Copy, 0, size);
        data = Copy.clone();
        size ++;
    }

    public T get(int i){
        return (T)data[i];
    }

    public void clear(){
        data = new Object[DEFAULT_SIZE];
        size = 0;
    }
}
