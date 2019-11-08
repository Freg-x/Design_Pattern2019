package TicketPurchaseModel.Interpreter;
import java.util.*;
//非终结符表达式
public class AndExpression implements Expression
{
	private Expression person = null;
	public AndExpression(Expression person)
	{
		this.person = person;
	}
	public boolean interpret(String info)
	{
		return person.interpret(info);
	}
}