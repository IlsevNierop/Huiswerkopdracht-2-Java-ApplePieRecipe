import com.sun.security.auth.module.LdapLoginModule;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        applePieRecipe.addNewIngredients();

        applePieRecipe.printIngredients();

        applePieRecipe.printSteps(applePieRecipe.listSteps);

    }
}
