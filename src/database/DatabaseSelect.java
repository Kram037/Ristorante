package database;

import entities.Dish;
import enumerations.FoodPreferencesEnum;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class DatabaseSelect{

    private final static DatabaseSelect  databaseSelect= new DatabaseSelect();
    private static final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private static final String user = "root";
    private static final String password = "password";
    private Set<Dish> dishes = new HashSet<>();

    private DatabaseSelect(){
    }

    public Set<Dish> getDishes(){
        return dishes;
    }

    public void setDishes(Set<Dish> dishes){
        this.dishes = dishes;
    }
    public static DatabaseSelect getInstance(){return databaseSelect;}

    /**
     * Prints all the details of the elements of the Set 'dishes' through a forEach
     */
    public void printDishesInfo(){
        dishes.forEach(single -> System.out.println(
                "name: " + single.getName() + " ingredients: " + single.getIngredients() + " price: " +
                        single.getPrice() + " food preference: " + single.getFoodPreference()));
    }

    /**
     * does select to the dish table and each table's row creates a dish object and adds to a Set(List)
     */
    public void addDishesFromDbTable() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM dish");
        while(resultSet.next()){
            Dish dish = new Dish();
            dish.setName(resultSet.getString("name"));
            dish.setIngredients(resultSet.getString("ingredients"));
            dish.setPrice(resultSet.getDouble("price"));
            dish.setPreference(FoodPreferencesEnum.valueOf(resultSet.getString("food_preference")));
            dishes.add(dish);
        }
        System.out.println("All rows have been added");
        connection.close();
    }
}


