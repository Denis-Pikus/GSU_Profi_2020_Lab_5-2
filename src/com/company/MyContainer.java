package com.company;

import com.store.GroceryStore;
import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.Scanner;

public class MyContainer<T> {
    private T[] array = (T[]) new Object[10];
    //private GroceryStoreFactory factory = new GroceryStoreFactory();
    Scanner sc = new Scanner(System.in);
    private int count = 0;

    public void add(T element){
        if (count >= array.length) {
            T[] array1 = (T[]) new Object[array.length + array.length / 2 + 1];
            array1 = Arrays.copyOf(array, array1.length);
            array = array1;
        }
        array[count++] = (T) element;
    }

    public void update(int index, T element){
        array[index] = element;
    }

    public void delete(int element){
        for (int i = element; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public T[] getArray() {return array;}

    public int size() {return count;}

    public void printAll() {
        Arrays.stream(array).filter(a -> a != null).forEach(System.out::println);
    }
}
