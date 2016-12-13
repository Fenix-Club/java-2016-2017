package logic.item.potion;

import logic.hero.Hero;

public class HealthPotion extends Potion {

    private static final int HEALING_VALUE = 10;

    @Override
    public String getItemName() {
        return "Potion of Health";
    }

    @Override
    public void use(Hero hero) {
        if (hero.getMaxHealth() - hero.getHealth() >= HEALING_VALUE) {
            hero.setHealth(hero.getHealth() + HEALING_VALUE);
        }
    }
}
