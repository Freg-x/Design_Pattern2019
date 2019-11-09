package GateScene.chainOfResponsibility;

import GateScene.chainOfResponsibility.item.Item;

public class SharpItemCheckComponent extends SecurityCheckComponent {
    @Override
    public String getDescription() {
        return "sharpItemCheckComponent, to check if the item contains anything sharp";
    }

    @Override
    public boolean check(Item item) {
        System.out.println("Processing with " + getDescription());
        if (item.checkAttribute(Item.Attribute.sharp)) {
            if (this.getNext() == null) {
                return true;
            } else {
                return this.getNext().check(item);
            }
        } else {
            System.out.println("Sorry, you can't pass this check");
            return false;
        }
    }
}
