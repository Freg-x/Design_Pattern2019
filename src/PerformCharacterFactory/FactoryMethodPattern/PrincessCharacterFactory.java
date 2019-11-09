package PerformCharacterFactory.FactoryMethodPattern;

public class PrincessCharacterFactory extends CharacterFactory {
    public CharacterProduct createCharacter() {
        return new PrincessCharacter();
    }
}
