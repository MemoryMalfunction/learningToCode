
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devon
 */
public class Cookbook {

    ArrayList<Recipe> recipes;

    public Cookbook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    public void showTheMagic() {
        for (Recipe each : recipes) {
            System.out.println(each.getName() + ", cooking time: " + each.getCookTime() + each.getIngredients());
        }
    }

//    public void findByName(String name) {
//        for (Recipe each : recipes) {
//            if (each.getName().contains(name)) {
//                System.out.println(each);
//            }
//        }
//    }

}
