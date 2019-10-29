package GateScene.chainOfResponsibility;

import GateScene.chainOfResponsibility.item.Item;

public class ExplosiveOrFlammableItemCheckComponent extends SecurityCheckComponent {
    @Override
    public String getDescription() {
        return "explosiveItemCheckComponent, to check if the item contains anything explosive";
    }
    @Override
    public boolean check(Item item) {
        System.out.println("Processing with "+ getDescription());
        if(item.checkAttribute(Item.Attribute.explosive)&&item.checkAttribute(Item.Attribute.flammable)){
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
