package PerformCharacterFactory.FactoryMethodPattern;

public class DwarfCharacterFactory extends CharacterFactory {
    public CharacterProduct createCharacter(){
        return new DwarfCharacter();
    }
}
