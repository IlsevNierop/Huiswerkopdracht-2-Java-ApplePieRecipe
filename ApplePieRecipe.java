import java.util.ArrayList;

public class ApplePieRecipe {

public Ingredient ingredient;


public ApplePieRecipe(){

}

    public String steps = "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)\n" +
            "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n" +
            "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n" +
            "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n" +
            "Vet de springvorm in en bestrooi deze met bloem\n" +
            "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n" +
            "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n" +
            "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n" +
            "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n" +
            "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.";

    public String[] listSteps = steps.split("\n");


    public static void printSteps(String[] listSteps){
        System.out.println("\nSTAPPEN:");
        for (int i = 0; i < listSteps.length ; i++){
            System.out.println(i+1 + " " + listSteps[i]);
        }

}

//    public ApplePieRecipe(Ingredient ingredient){
//        this.ingredient = ingredient;
////        this.step = step;
//
//    }

    static ArrayList<Ingredient> listIngredients = new ArrayList<>();

    public static void addNewIngredients() {

     listIngredients.add(new Ingredient("ongezouten roomboter", 200f, "gram"));
     listIngredients.add(new Ingredient("witte basterd suiker", 200f, "gram"));
     listIngredients.add(new Ingredient("zelfrijzend bakmeel", 400f, "gram"));
     listIngredients.add(new Ingredient("ei", 1f, "stuk(s)"));
     listIngredients.add(new Ingredient("vanillesuiker", 8f, "gram"));
     listIngredients.add(new Ingredient("zout", 1f, "snuf"));
     listIngredients.add(new Ingredient("zoetzure appels", 1.5f, "kilo"));
     listIngredients.add(new Ingredient("kristal suiker", 75f, "gram"));
     listIngredients.add(new Ingredient("kaneel", 3f, "theelepels"));
     listIngredients.add(new Ingredient("paneermeel", 15f, "gram"));


 }

 public void printIngredients() {
     System.out.println("\nINGREDIENTEN:");

     for (Ingredient ingredient : listIngredients){
         System.out.println("• " + ingredient.getAmount() + " " + ingredient.getWeightUnit() + " " + ingredient.getNameIngredient());
     }

    }

}
