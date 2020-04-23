package com.menu;

import com.company.MyContainer;

import java.util.Arrays;

public class PrintAllMenuItem<T> implements IMenuItem {
    private MyContainer<T> container;

    public PrintAllMenuItem(MyContainer<T> container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 4;
    }

    @Override
    public String getTitle() {
        return "Print all";
    }

    @Override
    public void execute() {
        T[] array = container.getArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}
