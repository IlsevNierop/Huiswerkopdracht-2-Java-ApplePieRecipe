import com.sun.security.auth.module.LdapLoginModule;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        applePieRecipe.addNewIngredients();

        applePieRecipe.printIngredients();

        applePieRecipe.printSteps(applePieRecipe.listSteps);


        //Instantiate new Pie, using PieRecipe class
        PieRecipe cheeseCake = new PieRecipe();

        cheeseCake.addNewIngredients(new Ingredient("boter", 100, "gram"));
        cheeseCake.addNewIngredients(new Ingredient("monchou", 600, "gram"));

        cheeseCake.addSteps("Meng de monchou met de suiker en klop dit minstens 4 minuten met de mixer.");

        cheeseCake.printIngredients();
        cheeseCake.printSteps();


    }
}
