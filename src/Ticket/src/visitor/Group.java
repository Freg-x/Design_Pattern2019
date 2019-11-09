package visitor;

//团体游客
public class Group implements Visitor {

    @Override
    public void visit(FullTicket fullticket) {
        System.out.println(this.getClass() + " : " + "visit(FullTicket fullticket)" + " : " + "Group visitor buy fullticket");

    }

    @Override
    public void visit(HalfTicket halfticket) {
        System.out.println(this.getClass() + " : " + "visit(HalfTicket halfticket)" + " : " + "Group visitor buy halfticket");

    }


}
