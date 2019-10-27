package GeneratePhotoElement.PhotoUser;
import GeneratePhotoElement.ArPhotoRoom.*;

public interface UserState {
    void request(User user, ProxyPhotoRoom room);
    String getStateName();
}
