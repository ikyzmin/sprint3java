public class Mage extends Hero implements MagicUser {
    private int mana;
    private final int maxMana;

    public Mage(String name, int health, int baseDamage, int maxMana) {
        super(name, health, baseDamage);
        this.maxMana = maxMana;
        this.mana = maxMana;
    }

    @Override
    public int attack() {
        if (mana > 0) {
            mana = mana - 10;
            return super.attack();
        } else {
            return 0;
        }
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
}
