abstract class Character {
    private int id;
    private String name;
    private int HP;
    private boolean isAlive;

    public Character(int id, String name, int HP, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.HP = HP;
        this.isAlive = isAlive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void doDamage(int damage) {
        // Must check if it is dead

        this.setHP(this.getHP() - damage);
    }

    public String toString() {
        return super.toString();
    }
}
