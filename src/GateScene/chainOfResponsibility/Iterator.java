package GateScene.chainOfResponsibility;

/**
 * interface of the iterator of a collection
 */
public interface Iterator<E> {

    /**
     * @return weather there is any item left in the collection
     */
    boolean hasNext();

    /**
     * @return the next item in the collection, can be a null value
     */
    E next();
}
