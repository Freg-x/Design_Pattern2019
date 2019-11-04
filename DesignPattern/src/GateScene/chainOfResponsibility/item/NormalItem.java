package GateScene.chainOfResponsibility.item;

/**
 * item contains no attr, or a safe item
 */
public class NormalItem implements Item {
    @Override
    public boolean checkAttribute(Attribute attr) {
        return true;
    }
}
