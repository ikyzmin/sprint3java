public interface MagicUser {
    int getCurrentMana();
    boolean canCastSpell(int manaCost);
    void restoreMana(int amount);
}
