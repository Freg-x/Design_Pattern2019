package GeneratePhotoElement.PhotoUser;
import GeneratePhotoElement.ArPhotoRoom.*;

public class WaitState implements UserState {

    private String stateName;

    public WaitState(){stateName = "Wait";}

    @Override
    public void request(User user, ProxyPhotoRoom room) {
        if(room.getState() == 0){

        System.out.println("access to Apply State!");
        user.setState(new ApplyState());
        room.proxy(user);

        }
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
