package DefineSyntax;

import DefineSyntax.InterpreterPattern.*;

public class DefineSyntaxTest {
    public static Expression getCharacterExpression(){
        Expression micky = new TerminalExpression("micky");
        Expression donald = new TerminalExpression("donald");
        return new orExpression(micky,donald);
    }

    public static Expression getDaisyFemaleExpression(){
        Expression daisy = new TerminalExpression("daisy");
        Expression female = new TerminalExpression("female");
        return new andExpression(daisy,female);
    }

    public static void main(String[] args) {
        Expression DisneyCharacter = getCharacterExpression();
        Expression isDaisyFemale = getDaisyFemaleExpression();

        System.out.println("Is micky a Disney Character? "+DisneyCharacter.interpret("micky"));
        System.out.println("Is Daisy a female? "+isDaisyFemale.interpret("daisy female"));


    }
}
