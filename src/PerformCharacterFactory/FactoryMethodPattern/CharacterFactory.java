package PerformCharacterFactory.FactoryMethodPattern;

public abstract class CharacterFactory {
    public abstract CharacterProduct createCharacter();

    public void performing(){
        CharacterProduct thisCharacter = createCharacter();
        thisCharacter.CharacterDance();
    }
}
