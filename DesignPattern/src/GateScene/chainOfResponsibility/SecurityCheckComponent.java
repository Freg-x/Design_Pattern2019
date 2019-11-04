package GateScene.chainOfResponsibility;
import GateScene.chainOfResponsibility.item.*;

/**
 * Security Check component, the abstract class of a component in the chain of responsibility.
 * The component can inspect an item, and decide to throw an error immediately or pass the item
 * to the next component
 */
public abstract  class SecurityCheckComponent {
    // store the next component
    private SecurityCheckComponent nextComponent;

    /** get the next component
     * @return the next component
     */
    SecurityCheckComponent getNext() {
        return nextComponent;
    }

    /** add a new component in the tail of the chain
     * @param component the next component in the chain of responsibility
     */
    void setNext(SecurityCheckComponent component) {
        if(nextComponent==null){
            nextComponent = component;
        }else {
            nextComponent.setNext(component);
        }
    }

    /**
     * @return simple description of this component
     */
    public String getDescription() {
        return null;
    }

    /** Core function of the component, accept an item and check if the item can pass the test
     * @param item the item to check
     * @return weather the item can pass this component
     */
    boolean check(Item item) {
        return false;
    }
}
