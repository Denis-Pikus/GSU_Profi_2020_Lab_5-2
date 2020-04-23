package com.store;

import java.util.ArrayList;
import java.util.Objects;

public class FishStore extends GroceryStore {

    public FishStore() {
    }

    public FishStore(ArrayList<String> foods, double squareStore) {
        super(foods, squareStore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FishStore)) return false;
        FishStore that = (FishStore) o;
        return Double.compare(that.getSquareStore(), getSquareStore()) == 0 &&
                Objects.equals(getFoods(), that.getFoods());
    }

    @Override
    public void sale() {
        System.out.println("Hello, here sell fishes!");
    }

}
