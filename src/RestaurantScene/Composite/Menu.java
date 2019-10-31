package Composite;
import Composite.MenuPart;
public class Menu {
    private String name;
    private MenuPart[] menuParts;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display(){
        for (MenuPart m :menuParts
             ) {
            m.display();
        }
    }
}
