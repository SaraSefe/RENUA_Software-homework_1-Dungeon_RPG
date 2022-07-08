import net.datafaker.Faker;

import java.util.UUID;

abstract class Character implements Attacker {
    private String id;
    private String name;
    protected int hp;
    private boolean isAlive;

    public Character(String id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    public Character(int hp) {
        Faker faker = new Faker();
        UUID uuid = UUID.randomUUID();

        this.id = uuid.toString();
        this.name = faker.name().name();
        this.hp = hp;
        this.isAlive = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void doDamage(int damage) {
        // Must check if it is dead

        this.setHp(this.getHp() - damage);
    }

    public String toString() {
        return super.toString();
    }

    public abstract void attack(Character character);
}

