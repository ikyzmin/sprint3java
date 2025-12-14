public class Hero {
    private final  String name;
    private int health;
    private final int baseDamage;

    public Hero(String name, int health, int baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public void introduce() {
        System.out.println("Приветствую тебя игрок!");
    }

    public int attack() {
        return baseDamage;
    }

    protected void takeDamage(int damage) {
        health = health - damage;

    }

    public boolean isAlive() {
        return health > 0;

    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
