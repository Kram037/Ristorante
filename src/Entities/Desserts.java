package Entities;
import Enumerations.DishType;
import Enumerations.FoodPreferencesEnum;

public class Desserts extends Dish{

    public Desserts(String name, String ingredients, double price, FoodPreferencesEnum preference, DishType dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}
