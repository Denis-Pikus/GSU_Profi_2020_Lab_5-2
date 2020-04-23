package com.store;

import java.util.ArrayList;
import java.util.Objects;

public class SweetStore extends GroceryStore {

    public SweetStore() {
    }

    public SweetStore(ArrayList<String> foods, double squareStore) {
        super(foods, squareStore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SweetStore)) return false;
        SweetStore that = (SweetStore) o;
        return Double.compare(that.getSquareStore(), getSquareStore()) == 0 &&
                Objects.equals(getFoods(), that.getFoods());
    }

    @Override
    public void sale() {
        System.out.println("Hello, here sell sweets!");
    }
}
