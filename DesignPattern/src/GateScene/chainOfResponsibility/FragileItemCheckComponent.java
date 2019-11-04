package GateScene.chainOfResponsibility;

import GateScene.chainOfResponsibility.item.Item;

public class FragileItemCheckComponent extends SecurityCheckComponent {
    @Override
    public String getDescription() {
        return "fragileItemCheckComponent, to check if the item contains anything fragile";
    }
    @Override
    public boolean check(Item item) {
        System.out.println("Processing with "+ getDescription());
        if(item.checkAttribute(Item.Attribute.fragile)){
            if(this.getNext()==null){
                return true;
            }else {
                return this.getNext().check(item);
            }
        }else {
            System.out.println("Sorry, you can't pass this check");
            return false;
        }
    }
}
