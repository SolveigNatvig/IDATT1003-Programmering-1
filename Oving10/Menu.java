package IDATT1003_Programmering_1.Oving10;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishes;

    public Menu(ArrayList<Dish> dishes){
        this.dishes = dishes;
    }

    public ArrayList<Dish> getDishes(){
        return this.dishes;
    }

    @Override
    public String toString() {
        return "Menu: " + dishes;
    }

}
