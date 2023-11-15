package org.eric;

import org.eric.dto.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish dish1 = new Dish("French Fries", 2.99, FoodType.VEGETABLE);
        Beverage beverage1 = new Beverage("Coke", 1.99, false);
        Combo combo1 = new Combo("Coke & Fries");
        combo1.addDish(dish1);
        combo1.addBeverage(beverage1);

        restaurantManagementSystem.addCombo(combo1);

        System.out.println(restaurantManagementSystem);
    }
}