package com.menu;

import com.company.GroceryStoreFactory;
import com.company.MyContainer;

public class AddMenuItem<T> implements IMenuItem {
    private MyContainer<T> container;
    private GroceryStoreFactory factory;

    public AddMenuItem(MyContainer<T> container, GroceryStoreFactory factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Add element";
    }

    @Override
    public void execute() {
        container.add((T) factory.create());
    }
}
