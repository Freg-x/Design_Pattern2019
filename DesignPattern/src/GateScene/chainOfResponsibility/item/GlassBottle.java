package GateScene.chainOfResponsibility.item;

import java.util.HashSet;
import java.util.Set;

public class GlassBottle implements Item {
    private Set<Attribute> attributes;
    @Override
    public boolean checkAttribute(Attribute attr) {
        return !attributes.contains(attr);
    }

    public GlassBottle(){
        attributes = new HashSet<>();
        attributes.add(Attribute.fragile);
    }
}
