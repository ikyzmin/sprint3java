public class Warrior extends Hero implements Tank {
    private int armor;

    public Warrior(String name, int health, int baseDamage, int armor) {
        super(name, health, baseDamage);
        this.armor = armor;
    }

    @Override
    public int attack() {
        return super.attack() + 5;
    }

    public void takeDamage(int damage) {
        int health = getHealth();
        int damageTemp = 0;
        if (damage > armor) {
            damageTemp = damage - armor;
        }
        setHealth(health - damageTemp);
    }

    public int getArmorValue() {
        return armor;
    }

    public void fortify() {
        armor = armor + 10;
    }

    public boolean canBlock() {
        return armor > 0;
    }
}

