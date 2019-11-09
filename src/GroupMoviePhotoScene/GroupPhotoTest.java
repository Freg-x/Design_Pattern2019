import GeneratePhotoElement.PhotoUser.*;
import GeneratePhotoElement.ArPhotoRoom.*;
import GeneratePhotoElement.Photo.*;

/**
 * A GroupPhoto Scene
 * Including Proxy/Bridge/Abstract Factory/State/Prototype/Template
 * It is supposed to import only photoRoom and User, but i added the "Photo" class
 * Beacause only under this condition can you assume the characterName and background by your own
 *
 * @author Freakx
 * @version 0.3
 */


public class GroupPhotoTest {
    /**
     * Here is what the program do:
     * First, create one user and one photo room
     * Second, the User send a request to the room
     * Third, I assume the character and background word, then receive a photo
     * Finally, Clone the photo and go back to waiting state
     */

    public static void main(String[] args) {

        ProxyPhotoRoom test_room = new ProxyPhotoRoom();
        User test_usr = new User();
        test_usr.request(test_room);

        MickeyPhoto testPhoto1 = new MickeyPhoto("MickeyMouse", "photo with mickey!!!");
        String testCharacterName = testPhoto1.getPhotoScene().getMainCharacter().getCharacterName();
        String testBackground = testPhoto1.getBackground();
        String testLogo = testPhoto1.getLogo();

        testPhoto1.getPhotoScene().getMainCharacter().sayHi();
        testPhoto1.getPhotoScene().getMainCharacter().hug();
        testPhoto1.getPhotoScene().getMainCharacter().pose();

        System.out.println("the main Ar Character in this photo is " + testCharacterName);
        System.out.println("the background word in this photo is " + testBackground);
        System.out.println("the Logo in this photo is " + testLogo + "\n");


        test_usr.request(test_room);

        BasicPhoto testPhoto2 = testPhoto1.clone();

        String testCloneCharacterName = testPhoto2.getPhotoScene().getMainCharacter().getCharacterName();
        System.out.println("the main Ar Character in Clone photo is " + testCharacterName);

        test_usr.request(test_room);

    }
}
