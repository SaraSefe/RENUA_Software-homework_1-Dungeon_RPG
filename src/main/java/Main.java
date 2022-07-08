import utilities.menu.Menu;
import utilities.menu.MenuOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    enum MainMenuOptions {
        opt1 // MUST CHANGE, DO NOT KEEP THIS NAME. IT IS AN EXAMPLE
    }

    public static void main(String[] args) {

        //Requirement 1
        var mainMenu = new Menu<MainMenuOptions>(new MenuOption[] {
            MenuOption.create("Opt 1", MainMenuOptions.opt1)
        }, "Main menu", "Choose an option:");

        var selected = mainMenu.display();

        //Requirement 2
        List<Warrior> warriorsParty = new ArrayList<>();
        List<Wizard> wizardsParty = new ArrayList<>();
        List<Character> graveyard = new ArrayList<>();

        var warrior1 = new Warrior(
                1,
                "Warrior1",
                true
        );

        var wizard1 = new Wizard(
                1,
                "Wizard1",
                true
        );

        System.out.println("warrior 1: " + warrior1);
        System.out.println("wizard  1: " + wizard1);
        System.out.println();

        int counter = 0;
        while(warrior1.getStamina() >= 1) {
            warrior1.attack(wizard1);
            counter++;
            System.out.println("warrior 1: " + counter + " " + warrior1);
            System.out.println("wizard  1: " + wizard1);
        }

    }
}