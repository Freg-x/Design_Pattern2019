package GeneratePhotoElement.PhotoUser;

import GeneratePhotoElement.ArPhotoRoom.*;

public class ApplyState implements UserState {

    public String stateName;

    public ApplyState() {
        stateName = "Apply";
    }

    @Override
    public void request(User user, ProxyPhotoRoom room) {
        System.out.println("Access to End state!");
        user.setState(new EndState());
        room.proxy(user);
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
