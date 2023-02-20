import java.util.ArrayList;

public class Ingredient {
    private String nameIngredient;
    private float amount;
    private String weightUnit;

    public Ingredient() {

    }

    public Ingredient(String nameIngredient, float amount, String weightUnit) {
        this.nameIngredient = nameIngredient;
        this.amount = amount;
        this.weightUnit = weightUnit;
    }

    public void setNameIngredient (String nameIngredient){
        this.nameIngredient = nameIngredient;
    }

    public String getNameIngredient () {
        return this.nameIngredient;
    }

    public void setAmount (float amount){
        this.amount = amount;
    }

    public float getAmount (){
        return this.amount;
    }
    public void setWeightUnit(String weightUnit){
        this.weightUnit = weightUnit;
    }

    public String getWeightUnit(){
        return this.weightUnit;
    }


}
