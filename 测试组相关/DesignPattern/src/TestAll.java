import BuildModel.BuildTest;
import EntertainmentModel.EntertainmentTest;
import MaintenanceModel.MaintenanceModelTest;
import ServiceModel.ServiceTest;
import TicketPurchaseModel.TicketPurchaseTest;


public class TestAll {
    public static void main(String[] args) {
       BuildTest buildTest=new BuildTest();
        EntertainmentTest entertainmentTest=new EntertainmentTest();
        MaintenanceModelTest maintenanceModelTest=new MaintenanceModelTest();
        ServiceTest serviceTest=new ServiceTest();
        TicketPurchaseTest ticketPurchaseTest=new TicketPurchaseTest();

        buildTest.ModelTest();
        entertainmentTest.ModelTest();
        maintenanceModelTest.ModelTest();
        serviceTest.ModelTest();
        ticketPurchaseTest.ModelTest();
    }

}
