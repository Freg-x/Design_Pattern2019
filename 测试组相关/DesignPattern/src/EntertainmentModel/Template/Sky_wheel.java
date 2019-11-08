package EntertainmentModel.Template;

public class Sky_wheel extends Facility {

    @Override
    protected void Facility_Start() {
        System.out.println("Sky_wheel:Facility_Start(): Sky-Wheel Start");
    }

    @Override
    protected void Facility_Run() {
        System.out.println("Sky_wheel:Facility_Run(): Sky-whell rotates three times");
    }
}
