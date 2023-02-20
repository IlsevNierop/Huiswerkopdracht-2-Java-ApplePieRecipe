import java.util.ArrayList;

public class PieRecipe {

    public Ingredient ingredient;

    public static String ingredients;

    public String steps;

    public static String[] arraySteps;

public PieRecipe(){

}

    public PieRecipe(Ingredient ingredient, String steps) {
        this.ingredient = ingredient;
        this.steps = steps;
    }


    static ArrayList<String> listSteps = new ArrayList<>();
    public void addSteps(String steps) {
        listSteps.add(steps);
    }
    public void printSteps() {
        System.out.println("\nSTAPPEN:");
        for (int i = 0; i < listSteps.size(); i++) {
            System.out.println(i + 1 + " " + listSteps.get(i));
        }
    }

        static ArrayList<Ingredient> listIngredients = new ArrayList<>();

        public void addNewIngredients(Ingredient ingredient) {
            listIngredients.add(ingredient);
        }

    public void printIngredients() {
        System.out.println("\nINGREDIENTEN:");

        for (Ingredient ingredient : listIngredients){
            System.out.println("• " + ingredient.getAmount() + " " + ingredient.getWeightUnit() + " " + ingredient.getNameIngredient());
        }

    }

    }
