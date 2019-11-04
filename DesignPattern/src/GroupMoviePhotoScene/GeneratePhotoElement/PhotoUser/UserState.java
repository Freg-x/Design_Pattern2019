package GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser;
import GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom.*;

/** Mainly Applied the State Pattern
* @author Freakx
* */

public interface UserState {

    /** request means a single operation that trying to access to next state
    *  @param user
    *         the request origin
    *         room
    *         the request target
    *  @author Freakx
    * */
    void request(User user, ProxyPhotoRoom room);

    String getStateName();
}
