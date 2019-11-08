package TicketPurchaseModel.Interpreter;

import java.util.*;

//接口，抽象表达式
public interface Expression {
    public boolean interpret(String info);
}