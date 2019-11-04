package Ticket.Visitor;
import Ticket.Visitor.Ticket;

//半价票
public class HalfTicket implements Ticket {

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
		
	}

}
