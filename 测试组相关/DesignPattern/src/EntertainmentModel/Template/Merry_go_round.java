package EntertainmentModel.Template;

public class Merry_go_round extends Facility {

    @Override
    protected void Facility_Start() {
        System.out.println("Merry_go_round:Facility_Start(): Merry_go_round Start");
    }

    @Override
    protected void Facility_Run() {
        System.out.println("Merry_go_round:Facility_Run(): Playing music, the carousel is spinning");
    }
}
