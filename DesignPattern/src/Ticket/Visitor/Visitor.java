package Ticket.Visitor;

//抽象的访问者接口
public interface Visitor {
	//买全价票
	public void visit(FullTicket fullticket);
	//买半价票
    public void visit(HalfTicket halfticket);

}
