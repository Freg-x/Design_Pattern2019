package visitor;

import visitor.Ticket;
import visitor.Visitor;

//全价票
public class FullTicket implements Ticket {

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);

    }


}
