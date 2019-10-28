package visitor;

import java.util.ArrayList;
import java.util.List;
import visitor.Visitor;
import visitor.Ticket;

//元素结合类
public class TicketStructure {
	private final List<Ticket> elements = new ArrayList<Ticket>();
	//添加元素
    public void addElement(final Ticket e)
     {
        elements.add(e);
    }
    //移除元素
    public void removeElement(final Ticket e)
     {
        elements.remove(e);
    }
    public void accept(final Visitor visitor)
     {
        for (final Ticket e : elements)
          {
           e.accept(visitor);
        }
    }

}
