package EntertainmentModel.Template;

public class Roller_coasters extends Facility {

    @Override
    protected void Facility_Start() {
        System.out.println("Roller_coasters:Facility_Start(): Roller_coasters Start");
    }

    @Override
    protected void Facility_Run() {
        System.out.println("Roller_coasters:Facility_Run(): Roller coaster passes through the tunnel and heads for the end");
    }
}
