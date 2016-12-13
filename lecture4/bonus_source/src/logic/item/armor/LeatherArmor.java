package logic.item.armor;

import logic.hero.Hero;

public class LeatherArmor extends Armor {

    @Override
    protected int getArmorValue() {
        return 15;
    }

    @Override
    public String getItemName() {
        return "Leather Armor";
    }

    @Override
    public void equip(Hero hero) {
        hero.setArmor(hero.getArmor() + getArmorValue());
    }
}
