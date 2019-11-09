package DefineSyntax.InterpreterPattern;

public abstract class nonTerminalExpression implements Expression {
    Expression expr1, expr2;

    public nonTerminalExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
}
