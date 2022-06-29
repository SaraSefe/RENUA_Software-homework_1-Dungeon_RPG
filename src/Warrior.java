public class Warrior extends Character{
    int stamina;
    int attack;
    int strength;

    public Warrior(int id, String name, int HP, boolean isAlive, int stamina, int attack, int strength) {
        super(id, name, HP, isAlive);
        this.stamina = stamina;
        this.attack = attack;
        this.strength = strength;
    }

    public Warrior(int id, String name, int HP, boolean isAlive) {
        super(id, name, HP, isAlive);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

   
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", attack=" + attack +
                ", strength=" + strength +
                '}';
    }
}
