package visitor;

//单人游客
public class Single implements Visitor {

	@Override
	public void visit(FullTicket fullticket) {
		System.out.println(this.getClass() + " : " + "visit(FullTicket fullticket)" + " : " + "Sigle visitor buy fullticket");
		
	}

	@Override
	public void visit(HalfTicket halfticket) {
		System.out.println(this.getClass() + " : " + "visit(FullTicket fullticket)" + " : " + "Single visitor buy halfticket");
	}



}
