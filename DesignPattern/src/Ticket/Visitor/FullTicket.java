package Ticket.Visitor;
import Ticket.Visitor.Ticket;
import Ticket.Visitor.Visitor;

//全价票
public class FullTicket implements Ticket {

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
		
	}


}
