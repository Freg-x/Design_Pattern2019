package TicketPurchaseModel.Interpreter;

import java.util.*;

//环境类
public class Context {
    private String[] persons = {"children", "older"};
    private Expression Person;

    //实现函数
    public Context() {
        Expression person = new TerminalExpression(persons);
        Person = new TicketPurchaseModel.Interpreter.AndExpression(person);
    }

    //匹配函数
    public void freeRide(String info) {
        boolean ok = Person.interpret(info);
        if (ok) System.out.println("Context:freeRide():you belong to " + info + ",your ticket price is 180");
        else System.out.println("Context:freeRide():"+info + " you do not belong to both, your ticket price is 200");

    }

}