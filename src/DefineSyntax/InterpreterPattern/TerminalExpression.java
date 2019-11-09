package DefineSyntax.InterpreterPattern;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        System.out.println("Calling the Interpreter Pattern!");
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
