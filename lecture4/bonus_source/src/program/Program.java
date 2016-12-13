package program;

import logic.hero.Hero;
import logic.item.armor.LeatherArmor;
import logic.item.potion.LevelPotion;

public class Program {

    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero);

        hero.useItem(new LevelPotion());
        System.out.println(hero);

        hero.equipItem(new LeatherArmor());
        System.out.println(hero);

        hero.useItem(new LevelPotion());
        System.out.println(hero);
    }
}
