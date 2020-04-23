package com.store;

import java.util.ArrayList;
import java.util.Objects;

public class VegetableStore extends GroceryStore {

    public VegetableStore(){}

    public VegetableStore(ArrayList<String> foods, double squareStore) {
        super(foods, squareStore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VegetableStore)) return false;
        VegetableStore that = (VegetableStore) o;
        return Double.compare(that.getSquareStore(), getSquareStore()) == 0 &&
                Objects.equals(getFoods(), that.getFoods());
    }

    @Override
    public void sale() {
        System.out.println("Hello, here sell vegetables!");
    }
}
