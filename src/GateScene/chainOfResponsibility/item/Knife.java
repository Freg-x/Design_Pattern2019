package GateScene.chainOfResponsibility.item;

import java.util.HashSet;
import java.util.Set;

public class Knife implements Item {
    private Set<Attribute> attributes;

    @Override
    public boolean checkAttribute(Attribute attr) {
        return !attributes.contains(attr);
    }

    public Knife() {
        attributes = new HashSet<>();
        attributes.add(Attribute.sharp);
    }
}
