public class Palladin extends Hero implements MagicUser, Tank {
    private int armor;
    private int mana;
    private final int maxMana;

    public Palladin(String name, int health, int baseDamage, int armor, int maxMana) {
        super(name, health, baseDamage);
        this.mana = maxMana;
        this.armor = armor;
        this.maxMana = maxMana;
    }

    @Override
    public void introduce() {
        System.out.println("Я умею колдовать: Огонь и Вода!");
        this.mana = mana - 10; //При атаке вычитается мана.
    }

    @Override
    public int getCurrentMana() {
        return this.mana;
    }

    @Override
    public boolean canCastSpell(int manaCost) {
        return mana >= manaCost;
    }

    @Override
    public void restoreMana(int amount) {
        mana = maxMana;

    }

    @Override
    public int getArmorValue() {
        return armor;
    }

    @Override
    public void fortify() {
        armor = armor + 10;

    }

    @Override
    public boolean canBlock() {
        return armor > 0;
    }

    public int attack() {
        return super.attack() + 20;
    }

    public void takeDamage(int damage) {
        int health = getHealth();
        int damageTemp = 0;
        if (damage > armor) {
            damageTemp = damage - armor;
        }
        setHealth(health - damageTemp);
    }
}
