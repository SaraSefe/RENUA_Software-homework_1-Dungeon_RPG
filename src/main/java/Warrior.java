public class Warrior extends Character {
    int stamina;
    int strength;

    public Warrior(int id, String name, int HP, boolean isAlive, int stamina, int attack, int strength) {
        super(id, name, HP, isAlive);
        this.stamina = stamina;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

   
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void attack(Character character) {
        if (stamina >= 5) {
            strongAttack(character);
        } else {
            weakAttack(character);
        }
    }

    private void strongAttack(Character character) {
        character.setHP(character.getHP() - this.strength);
        setStamina(getStamina() - 5);
    }

    private void weakAttack(Character character) {
        character.setHP(character.getHP() - (int)Math.floor(this.strength / 2.0));
        setStamina(getStamina() + 1);
    }
}
