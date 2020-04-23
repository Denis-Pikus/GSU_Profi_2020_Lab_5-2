package com.company;

import com.menu.*;
import com.store.GroceryStore;

public class GroceryStoreMain {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.run();
        MyContainer<GroceryStore> container = new MyContainer();
        GroceryStoreFactory factory = new GroceryStoreFactory();
        IMenuItem[] array = {
                new AddMenuItem<GroceryStore>(container, factory),
                new UpdateMenuItem<GroceryStore>(container, factory),
                new DeleteMenuItem<GroceryStore>(container),
                new PrintAllMenuItem<GroceryStore>(container),
        };
        new MyMenu(array, "Super menu", 0).run();
    }
}
