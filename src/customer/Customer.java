package customer;
import Enumerations.FoodPreferencesEnum;

public class Customer {

    public String nominal;
    public FoodPreferencesEnum foodPreference;

    public Customer(String nominal, FoodPreferencesEnum foodPreference){
        this.nominal = nominal;
        this.foodPreference = foodPreference;
    }



}
