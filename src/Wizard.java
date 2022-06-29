public class Wizard extends Character{
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }
}
