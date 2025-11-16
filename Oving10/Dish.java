package IDATT1003_Programmering_1.Oving10;

class Dish {
    private String name;
    private String type;
    private double price;
    private String recipe;

    public Dish(String name, String type, double price, String recipe){
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public double getPrice(){
        return this.price;
    }

    public String getRecipe(){
        return this.recipe;
    }

    @Override
    public String toString() {
        return "\n--- Dish ---" +
            "\nName: " + name +
            "\nType: " + type +
            "\nPrice: " + price +
            "\nRecipe: " + recipe +
            "\n";
    }


}
