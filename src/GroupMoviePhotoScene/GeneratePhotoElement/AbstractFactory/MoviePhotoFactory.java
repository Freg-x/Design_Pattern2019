package GeneratePhotoElement.AbstractFactory;
import GeneratePhotoElement.*;

public interface MoviePhotoFactory {
    MovieScene createScene(String characterName, String background);
    String createLogo();
}
