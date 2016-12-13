package logic.item.armor;

import logic.item.Equippable;
import logic.item.Item;

public abstract class Armor extends Item implements Equippable {

    protected abstract int getArmorValue();
}
