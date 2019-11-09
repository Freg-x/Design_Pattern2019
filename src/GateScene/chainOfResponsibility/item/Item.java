package GateScene.chainOfResponsibility.item;

/**
 * item to check
 */
public interface Item {
    /**
     * @param attr attribute to check
     * @return weather the item contains the attribute
     */
    public boolean checkAttribute(Attribute attr);

    /**
     * enum of attributes
     */
    enum Attribute {
        sharp, explosive, flammable, fragile
    }
}
