import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Requirement 1
        //TODO create menu

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