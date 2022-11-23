package entities;
import java.util.ArrayList;
import java.util.List;

/**
 * The Singleton used for instantiate the menu.
 */
public class Menu {

    private static final Menu menu = new Menu();

    private final String restaurantName = "I Secondini";

    private static List<Course> courseList = new ArrayList<>();

    private Menu(){}

    /**
     * Get instance menu.
     *
     * @return the menu
     */
    public static Menu getInstance(){
        return menu;
    }

    /**
     * Add all the dishes lists to the courseList.
     *
     * @param courseList the course list
     */
    public void addDishMenu(Course courseList){
        Menu.courseList.add(courseList);
    }

    /**
     * Print the menu.
     */
    public void printMenu(){

        System.out.println(restaurantName);

        for(Course dishMenu : courseList){
            dishMenu.printDishMenu();
        }

    }


}
