package com.menu;

import com.company.GroceryStoreFactory;
import com.company.MyContainer;
import com.company.ScannerWrapper;

public class UpdateMenuItem<T> implements IMenuItem {
    private MyContainer<T> container;
    private GroceryStoreFactory factory;
    private ScannerWrapper sc = new ScannerWrapper();

    public UpdateMenuItem(MyContainer<T> container, GroceryStoreFactory factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String getTitle() {
        return "Update element";
    }

    @Override
    public void execute() {
        System.out.println("Input index");
        int index = sc.nextInt();
        container.update(index, (T) factory.create());
    }
}
