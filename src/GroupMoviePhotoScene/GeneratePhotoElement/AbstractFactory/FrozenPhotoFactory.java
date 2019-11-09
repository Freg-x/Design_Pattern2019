package GeneratePhotoElement.AbstractFactory;

import GeneratePhotoElement.*;
import GeneratePhotoElement.Character.*;

public class FrozenPhotoFactory implements MoviePhotoFactory {
    @Override
    public MovieScene createScene(String characterName, String background) {
        return null;
    }

    @Override
    public String createLogo() {
        return "FrozenLogo";
    }
}
