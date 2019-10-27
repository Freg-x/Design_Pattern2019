package GeneratePhotoElement.AbstractFactory;
import GeneratePhotoElement.*;

public interface MoviePhotoFactory {

    /* Generate a Scene with one Character and background word
    * @param characterName
    *        Choose one Disney Character
    *        background
    *        Choose one background word
    * @return A generated scene
    * @author Freakx
    * */
    MovieScene createScene(String characterName, String background);

    /* Create one logo(represented by a String)
    @ return A String that represents the logo
    * */

    String createLogo();
}
