package it.restaurantSite.entities;
import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Appetizers.
 */
public class Appetizers extends Dish{
    /**
     * Instantiates a new Appetizers.
     *
     * @param name        the name of the appetizers.
     * @param ingredients the ingredients of the appetizers.
     * @param price       the price of the appetizers.
     * @param preference  the food preference of the it.restaurantSite.restaurant.customer.
     */
    public Appetizers(String name,String ingredients,double price,FoodPreferencesEnum preference){
        super(name,ingredients,price,preference);
        setDishTypeEnum(DishTypeEnum.APPETIZER);
    }
}
