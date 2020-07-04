
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devon
 */
public class UserInterface {

    Scanner readInput;
    Cookbook theBook;

    public UserInterface() {
        this.readInput = new Scanner(System.in);
        this.theBook = new Cookbook();

    }

    public void loadFile() {
        System.out.println("File to read:");
        String input = readInput.nextLine();
        try ( Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredientsLine = scanner.nextLine();
                    if (ingredientsLine.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredientsLine);
                }

                Recipe newRecipe = new Recipe(name, cookTime, ingredients);
                theBook.add(newRecipe);

            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("");
        while (true) {
            System.out.println("Enter command:");
            String command = readInput.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.list();

           }// else if (command.equals("find name")) {
//                this.findName();
//            }

        }
    }

    public void list() {
        System.out.println("");
        System.out.println("Recipes:");
        theBook.showTheMagic();
        System.out.println("");
    }

//    public void findName() {
//        System.out.println("Searched word:");
//        String name = readInput.next();
//        theBook.findByName(name);
//    }
}
