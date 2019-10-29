package GateScene.chainOfResponsibility;

/**
 * implementation of Iterator, to traver the container of item
 */
public class SecurityCheckProcessIterator implements Iterator<SecurityCheckComponent> {
    private SecurityCheckComponent currentComponent;
    private boolean isBegin;

    /**
     * @return weather there is any component left in the process
     */
    @Override
    public boolean hasNext()
    {
        if (isBegin){
            return currentComponent!=null;
        }
        return currentComponent.getNext()!=null;
    }

    /**
     * @return the next component
     */
    @Override
    public SecurityCheckComponent next() {
        if(isBegin){
            isBegin = false;
            return currentComponent;
        }else {
            SecurityCheckComponent next =  currentComponent.getNext();
            currentComponent = next;
            return next;
        }
    }
    SecurityCheckProcessIterator(SecurityCheckComponent headComponent){
        currentComponent = headComponent;
        isBegin = true;
    }
}
