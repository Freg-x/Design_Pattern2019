package PerformCharacterFactory;

import PerformCharacterFactory.FactoryMethodPattern.*;

public class FactoryMethodTest {
    private static CharacterFactory factory1, factory2;

    public static void main(String[] args) {
        factory1 = new PrincessCharacterFactory();
        factory2 = new DwarfCharacterFactory();

        System.out.println("******** Using the Factory Method Pattern ********");
        System.out.println("Creating a princess:");
        factory1.performing();
        System.out.println("Creating a dwarf:");
        factory2.performing();
    }
}
