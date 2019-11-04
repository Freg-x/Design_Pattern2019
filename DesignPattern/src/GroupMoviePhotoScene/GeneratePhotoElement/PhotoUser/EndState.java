package GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser;
import GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom.*;

public class EndState implements UserState {
    private String stateName;

    public EndState(){stateName = "End";}

    @Override
    public void request(User user,ProxyPhotoRoom room) {
    System.out.println("Access to Wait State!");
    user.setState(new WaitState());
    room.proxy(user);
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
