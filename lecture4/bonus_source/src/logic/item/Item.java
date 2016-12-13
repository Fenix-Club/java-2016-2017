package logic.item;

public abstract class Item {

    public abstract String getItemName();

    @Override
    public String toString() {
        return getItemName();
    }
}
