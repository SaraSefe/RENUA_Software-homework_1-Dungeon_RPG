import utilities.menu.Menu;
import utilities.menu.MenuOption;

public class Wizard extends Character{

    enum Attacks {
        Fireball,
        StaffHit
    };
    private int mana;
    private int intelligence;
    public Wizard(int id, String name, int HP, boolean isAlive) {
        super(id, name, HP, isAlive);

    }

    public Wizard(int id, String name, int HP, boolean isAlive, int mana, int intelligence) {
        super(id, name, HP, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public void increaseMana(int mana) {
        this.setMana(this.getMana() + mana);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attack(Character target) {
        // TODO: give the user the ability to choose
        // When we wan to, we can remove comments and comment the code below
        /*var options = new MenuOption[] {
            MenuOption.create("Fireball", Attacks.Fireball, this.getMana() >= 5),
            MenuOption.create("Staff Hit", Attacks.StaffHit)
        };
        var chosenAttack = new Menu<Attacks>(options, "Attack", "Choose an attack").display();

        if(chosenAttack == Attacks.StaffHit) staffHit(target);
        else fireball(target);*/

        if(this.getMana() >= 5) fireball(target);
        else staffHit(target);
    }

    public void fireball(Character target) {
        if(this.getMana() >= 5) {
            this.increaseMana(-5);
            target.doDamage(this.getIntelligence());
        } else staffHit(target); // <-- Just in case
    }

    public void staffHit(Character target) {
        this.increaseMana(1);
        target.doDamage(2);
    }

    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }
}
