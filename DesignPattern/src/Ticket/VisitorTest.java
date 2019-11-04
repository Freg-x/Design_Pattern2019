package Ticket;

import Ticket.Visitor.FullTicket;
import Ticket.Visitor.Group;
import Ticket.Visitor.HalfTicket;
import Ticket.Visitor.Single;
import Ticket.Visitor.TicketStructure;

public class VisitorTest {

	public static void main(final String[] args)
	{
		final TicketStructure os = new TicketStructure();
        os.addElement(new FullTicket());
        os.addElement(new HalfTicket());
        final Single sVisitor = new Single();
        final Group gVisitor = new Group();
        os.accept(sVisitor);
        os.accept(gVisitor);
	}
}
