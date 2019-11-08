package TicketPurchaseModel.Interpreter;

import java.util.*;

//终结符表达式
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();

    //判断字符串
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }

    //解读函数
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}