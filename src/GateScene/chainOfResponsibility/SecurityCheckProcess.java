package GateScene.chainOfResponsibility;

import GateScene.chainOfResponsibility.item.Item;

/**
 * This class represent the process of security check in Disney Land. The process can
 * have many components, and those components can combine together in any order.
 * Each component can check an item independently, decide weather pass the item to the next
 * component or not. So the chain of component in the security check process become the
 * Chain of Responsibility.
 */
public class SecurityCheckProcess {
    public SecurityCheckComponent getHeadComponent() {
        return headComponent;
    }

    // the head component
    private SecurityCheckComponent headComponent;

    /**
     * Add a new component to the Security check process
     *
     * @param component the component to add to the use
     */
    public void Use(SecurityCheckComponent component) {
        System.out.println("Use component " + component.getClass().getName());
        if (headComponent == null) {
            headComponent = component;
        } else {
            headComponent.setNext(component);
        }
    }

    /**
     * Check an item
     *
     * @param item the item to process
     * @return if the item is safe, return true, else return false
     */
    public boolean process(Item item) {
        if (headComponent == null) {
            return false;
        } else {
            return headComponent.check(item);
        }
    }

    /**
     * A factory method of the iterator
     *
     * @return the security check iterator
     */
    public SecurityCheckProcessIterator createIterator() {
        if (headComponent == null) {
            return null;
        } else {
            return new SecurityCheckProcessIterator(headComponent);
        }
    }

}
