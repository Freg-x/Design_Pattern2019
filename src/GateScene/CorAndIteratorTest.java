package com.company;

import GateScene.chainOfResponsibility.*;
import GateScene.chainOfResponsibility.item.*;

public class CorAndIteratorTest {

    public static void main(String[] args) {
        System.out.println("This is the scene of Design Pattern `Chain of Responsibility`\n");
        System.out.println("At first, test the scenario that the bag is safe");
        SecurityCheckProcess p = new SecurityCheckProcess();
        // p.Use(new SharpItemCheckComponent());
        p.Use(new SharpItemCheckComponent());
        p.Use(new ExplosiveOrFlammableItemCheckComponent());
        p.Use(new FragileItemCheckComponent());
        ItemContainer bag = new ItemContainer();
        //bag.add(new Knife());
        bag.add(new NormalItem());
        bag.add(new NormalItem());
        bag.add(new NormalItem());
        boolean succeed = p.process(bag);
        if (succeed) {
            System.out.println("You have Passed the Security check! ");
        } else {
            System.out.println("Please recheck your own item and try to pass the security check again");
        }

        System.out.println("\nThen test the scenario that the bag is contains a glass bottle");
        bag = new ItemContainer();
        //bag.add(new Knife());
        bag.add(new GlassBottle());
        bag.add(new NormalItem());
        succeed = p.process(bag);
        if (succeed) {
            System.out.println("You have Passed the Security check! ");
        } else {
            System.out.println("Please recheck your own item and try to pass the security check again");
        }

        System.out.println("\nYou can change the order of the component, for example");
        System.out.println("make the fragile check component the first and process the bag again");
        p = new SecurityCheckProcess();
        p.Use(new FragileItemCheckComponent());
        p.Use(new SharpItemCheckComponent());
        p.Use(new ExplosiveOrFlammableItemCheckComponent());

        succeed = p.process(bag);
        if (succeed) {
            System.out.println("You have Passed the Security check! ");
        } else {
            System.out.println("Please recheck your own item and try to pass the security check again");
        }

        System.out.println("\nThis is the scene of Design Pattern `Iterator`");
        System.out.println("You will be able to traver all the component in the process by the iterator\n");
        Iterator<SecurityCheckComponent> iter = p.createIterator();
        while (iter.hasNext()) {
            SecurityCheckComponent component = iter.next();
            System.out.println("This component is " + component.getDescription());
        }
    }
}
