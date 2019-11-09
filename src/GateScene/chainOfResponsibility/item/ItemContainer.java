package GateScene.chainOfResponsibility.item;

import java.util.ArrayList;
import java.util.List;

/**
 * Container of items, and the container itself is also an item
 */
public class ItemContainer implements Item {
    /**
     * physical storage of items
     */
    private List<Item> items;

    @Override
    public boolean checkAttribute(Attribute attr) {
        for (Item item : items) {
            if (!item.checkAttribute(attr)) {
                return false;
            }
        }
        return true;
    }

    // the following function is very simple, just as the signature.
    public boolean add(Item item) {
        return items.add(item);
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public ItemContainer() {
        items = new ArrayList<>();
    }
}
