package com.menu;

import com.company.MyContainer;
import com.company.ScannerWrapper;

public class DeleteMenuItem<T> implements IMenuItem {
    private MyContainer<T> container;
    ScannerWrapper sc = new ScannerWrapper();

    public DeleteMenuItem(MyContainer<T> container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String getTitle() {
        return "Delete element";
    }

    @Override
    public void execute() {
        System.out.println("Input index");
        int choice = sc.nextInt();
        container.delete(choice);
    }
}
