package DefineSyntax.InterpreterPattern;

public class andExpression extends nonTerminalExpression {
    public andExpression(Expression expr1, Expression expr2) {
        super(expr1, expr2);
    }

    @Override
    public boolean interpret(String context) {
        return this.expr1.interpret(context) && this.expr2.interpret(context);
    }
}
