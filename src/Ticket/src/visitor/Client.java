package visitor;

//测试
public class Client {
    public static void main(final String[] args) {
        final TicketStructure os = new TicketStructure();
        os.addElement(new FullTicket());
        os.addElement(new HalfTicket());
        final Single sVisitor = new Single();
        final Group gVisitor = new Group();
        os.accept(sVisitor);
        os.accept(gVisitor);
    }

}
