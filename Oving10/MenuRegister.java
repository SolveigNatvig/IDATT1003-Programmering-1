package IDATT1003_Programmering_1.Oving10;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegister {
    private Menu menu;
    private ArrayList<Dish> dishesList;
    private ArrayList<Menu> menuList;
    

    public MenuRegister(){
        this.dishesList = new ArrayList();
        this.menuList = new ArrayList();

    }

    public void addNewDish(String name, String type, double price, String recipe){
        Dish dish = new Dish(name, type, price, recipe);
        this.dishesList.add(dish);
    }

    public ArrayList<Dish> getAllAppetisers(){
        ArrayList appetiserList = new ArrayList<>();
        for (Dish dish: this.dishesList){
            if (dish.getType().equals("appetiser")){
                appetiserList.add(dish);
            }
        }

        return appetiserList;
    }

    public ArrayList<Dish> getAllMainCourses(){
        ArrayList mainCourseList = new ArrayList<>();
        for (Dish dish: this.dishesList){
            if (dish.getType().equals("main course")){
                mainCourseList.add(dish);
            }
        }

        return mainCourseList;
    }

    public ArrayList<Dish> getAllDesserts(){
        ArrayList dessertList = new ArrayList<>();
        for (Dish dish: this.dishesList){
            if (dish.getType().equals("dessert")){
                dessertList.add(dish);
            }
        }

        return dessertList;
    }

    public ArrayList<Dish> findDishByName(String name){
        ArrayList dishList = new ArrayList<>();
        for (Dish dish: this.dishesList){
            if (dish.getName().equals(name)){
                dishList.add(dish);
            }  
        }
        return dishList;
    }

    public Menu registerNewMenu(ArrayList<Dish> list){
        Menu menu = new Menu(list);
        this.menuList.add(menu);
        return menu;
    }

    public ArrayList<Menu> findMenuWithinPricerange(double startprice, double stopprice){
        ArrayList<Menu> menuWithinPricerange = new ArrayList<>();
        double priceCount;
        for (Menu menu: this.menuList){
            priceCount = 0;
            for (Dish dish: menu.getDishes()){
                priceCount += dish.getPrice();
            }
            
            if (priceCount >= startprice && priceCount <= stopprice){
                menuWithinPricerange.add(menu);
            }
        }

        return menuWithinPricerange;
    }

    public static void main(String[] args) {

        MenuRegister register = new MenuRegister();
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add new dish");
            System.out.println("2. See all appetisers");
            System.out.println("3. See all main courses");
            System.out.println("4. See all desserts");
            System.out.println("5. Find dish by name");
            System.out.println("6. Add new menu");
            System.out.println("7. Find menu within pricerange");
            System.out.println("8. Quit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice){

                case 1: // ---------------- ADD NEW DISH ----------------
                    System.out.print("Dish name: ");
                    String name = scanner.nextLine();

                    System.out.print("Dish type (appetiser/main course/dessert): ");
                    String type = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Recipe: ");
                    String recipe = scanner.nextLine();

                    register.addNewDish(name, type, price, recipe);
                    System.out.println("Dish added!");
                    break;


                case 2: // ---------------- ALL APPETISERS ----------------
                    System.out.println(register.getAllAppetisers());
                    break;


                case 3: // ---------------- ALL MAIN COURSES ----------------
                    System.out.println(register.getAllMainCourses());
                    break;


                case 4: // ---------------- ALL DESSERTS ----------------
                    System.out.println(register.getAllDesserts());
                    break;


                case 5: // ---------------- FIND DISH BY NAME ----------------
                    System.out.print("Enter name: ");
                    String searchName = scanner.nextLine();
                    System.out.println(register.findDishByName(searchName));
                    break;


                case 6: // ---------------- REGISTER NEW MENU ----------------
                    System.out.println("How many dishes in the new menu?");
                    int count = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Dish> menuDishes = new ArrayList<>();

                    for (int i = 0; i < count; i++){
                        System.out.print("Name of dish " + (i+1) + ": ");
                        String dishName = scanner.nextLine();
                        ArrayList<Dish> found = register.findDishByName(dishName);

                        if (!found.isEmpty()) {
                            menuDishes.add(found.get(0));
                        } else {
                            System.out.println("Dish not found.");
                        }
                    }

                    Menu newMenu = register.registerNewMenu(menuDishes);
                    System.out.println("Menu registered: " + newMenu);
                    break;


                case 7: // ---------------- MENU WITHIN PRICE RANGE ----------------
                    System.out.print("Start price: ");
                    double start = scanner.nextDouble();
                    System.out.print("Stop price: ");
                    double stop = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println(register.findMenuWithinPricerange(start, stop));
                    break;


                case 8: // ---------------- QUIT ----------------
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
