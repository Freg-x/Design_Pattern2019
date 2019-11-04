package GateScene.chainOfResponsibility.item;

import java.util.HashSet;
import java.util.Set;

public class Lighter implements Item {
    private Set<Attribute> attributes;
    @Override
    public boolean checkAttribute(Attribute attr) {
        return !attributes.contains(attr);
    }

    public Lighter(){
        attributes = new HashSet<>();
        attributes.add(Attribute.explosive);
        attributes.add(Attribute.flammable);
    }
}
