package com.store;

import java.util.ArrayList;
import java.util.Objects;

public abstract class GroceryStore {
    private ArrayList<String> foods = new ArrayList<>();
    private double squareStore;

    public enum StoreType {
        FISH,
        MEAT,
        BREAD,
        HEALTHY_FOODS,
        VEGETABLES,
        SWEETS;
    }

    public GroceryStore() { }

    public GroceryStore(ArrayList<String> foods, double squareStore) {
        this.foods = foods;
        this.squareStore = squareStore;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public void setFoods(String food) {
        foods.add(food);
    }

    public double getSquareStore() {
        return squareStore;
    }

    public void setSquareStore(double squareStore) {
        if(squareStore > 0)
               this.squareStore = squareStore;
        else {
            System.out.println("The store area cannot be less than or equal to zero!");
            throw new IllegalArgumentException();
        }
    }

    public abstract void sale();

    //Метод который формирует "правильный" формат вывода на экран списка товаров
    private String showList(){
        StringBuilder sb = new StringBuilder();
        for (String food: foods) {
            sb.append(food + "\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroceryStore)) return false;
        GroceryStore that = (GroceryStore) o;
        return Double.compare(that.getSquareStore(), getSquareStore()) == 0 &&
                Objects.equals(getFoods(), that.getFoods());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoods(), getSquareStore());
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                ", square shop: " + squareStore + "m2\n" +
                "On sale today:\n" + showList();
    }
}
