package GeneratePhotoElement.AbstractFactory;

import GeneratePhotoElement.*;
import GeneratePhotoElement.Character.*;

public class MickeyPhotoFactory implements MoviePhotoFactory {
    @Override
    public MovieScene createScene(String characterName, String background) {
        if (characterName.equalsIgnoreCase("MickeyMouse")) return new MovieScene(new ArMickeyMouse(), background);
        else if (characterName.equalsIgnoreCase("DonaldDuck")) return new MovieScene(new ArDonaldDuck(), background);
        else return null;
    }

    ;

    @Override
    public String createLogo() {
        return "Mickey logo";
    }
}
