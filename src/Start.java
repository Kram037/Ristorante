import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;
import Enumerations.TableStatusEnum;
import menu.dishes.*;
import menu.*;
import reservation.Reservation;
import reservation.Restaurant;
import reservation.Table;

public class Start {

    public static void main(String[] args) {

        Menu menu = Menu.getInstance();


        Dish drink1 = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferencesEnum.VEGAN, KidMenuEnum.YES);
        Dish drink2 = new Drinks("Barbera", "Red Wine", 15, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.NOT);
        Dish drink3 = new Drinks("CocaCola", "Water, sugar, food preservative, secret recipe", 15, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.YES);

        Course drinksList = new Course();
        drinksList.addDish(drink1);
        drinksList.addDish(drink2);
        drinksList.addDish(drink3);
        menu.addDishMenu(drinksList);


        Dish appetizer1 = new Appetizers("Bruschetta", "Bread, tomatoes, olive oil, garlic", 5, FoodPreferencesEnum.VEGAN, KidMenuEnum.YES);
        Dish appetizer2 = new Appetizers("Chips and Dips", "Potatoes, sunflower oil, mayo, ketchup", 3, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.YES);
        Dish appetizer3 = new Appetizers("Shrimp Cocktail", "Shrimp, mayo, ketchup, salt", 10, FoodPreferencesEnum.ALL, KidMenuEnum.YES);

        Course appetizersList = new Course();
        appetizersList.addDish(appetizer1);
        appetizersList.addDish(appetizer2);
        appetizersList.addDish(appetizer3);
        menu.addDishMenu(appetizersList);


        Dish mainCourse1 = new MainCourses("Seafood linguine", "Linguine, seafood", 12, FoodPreferencesEnum.ALL, KidMenuEnum.YES);
        Dish mainCourse2 = new MainCourses("Carbonara", "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese", 8, FoodPreferencesEnum.ALL, KidMenuEnum.YES);
        Dish mainCourse3 = new MainCourses("Gnocchetti alla bava", "Potatoes gnocchi, cheese cream", 10, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.YES);

        Course mainCoursesList = new Course();
        mainCoursesList.addDish(mainCourse1);
        mainCoursesList.addDish(mainCourse2);
        mainCoursesList.addDish(mainCourse3);
        menu.addDishMenu(mainCoursesList);


        Dish secondCourse1 = new SecondCourses("Florentine steak", "Italian meat I.G.P.", 50.00, FoodPreferencesEnum.ALL, KidMenuEnum.YES);
        Dish secondCourse2 = new SecondCourses("Granny's cutlet", "Lots of love", 5.00, FoodPreferencesEnum.ALL, KidMenuEnum.YES);
        Dish secondCourse3 = new SecondCourses("Meat stew", "Secret ingredients", 8.00, FoodPreferencesEnum.ALL, KidMenuEnum.YES);

        Course secondCoursesList = new Course();
        secondCoursesList.addDish(secondCourse1);
        secondCoursesList.addDish(secondCourse2);
        secondCoursesList.addDish(secondCourse3);
        menu.addDishMenu(secondCoursesList);



        Dish dessert1 = new Desserts("Catalan cream", "Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar", 10.50, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.YES);
        Dish dessert2 = new Desserts("Chocolate pudding", "Milk, dark chocolate, sugar, butter, cornstarch", 25.00, FoodPreferencesEnum.VEGETARIAN, KidMenuEnum.YES);
        Dish dessert3 = new Desserts("Fresh fruit salad, super fresh", "Banana, kiwi, strawberries, green apple, tangerine", 5, FoodPreferencesEnum.VEGAN, KidMenuEnum.YES);

        Course dessertsList = new Course();
        dessertsList.addDish(dessert1);
        dessertsList.addDish(dessert2);
        dessertsList.addDish(dessert3);
        menu.addDishMenu(dessertsList);


        menu.printMenu();

        System.out.println();
        Table table1 = new Table(1, 4, TableStatusEnum.AVAILABLE);
        Table table2 = new Table(2, 8, TableStatusEnum.AVAILABLE);
        Table table3 = new Table(3, 2, TableStatusEnum.AVAILABLE);
        Table table4 = new Table(4, 3, TableStatusEnum.AVAILABLE);
        Table table5 = new Table(5, 15, TableStatusEnum.AVAILABLE);

        Reservation reservation1 = new Reservation("Rossi", 10);
        Reservation reservation2 = new Reservation("Bianchi", 16);
        Reservation reservation3 = new Reservation("De Santis", 2);
        Reservation reservation4 = new Reservation("Romano", 7);
        Reservation reservation5 = new Reservation("Bruno", 4);

        Restaurant restaurant = Restaurant.getInstance();
        restaurant.addTable(reservation1, table5);
        restaurant.addTable(reservation2, table1);
        restaurant.addTable(reservation3, table1);
        restaurant.addTable(reservation4, table2);
        restaurant.removeTable(reservation4, table2);

    }
}
