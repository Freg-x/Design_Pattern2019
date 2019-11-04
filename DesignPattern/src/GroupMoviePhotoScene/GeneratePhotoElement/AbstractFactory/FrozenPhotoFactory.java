package GroupMoviePhotoScene.GeneratePhotoElement.AbstractFactory;
import GroupMoviePhotoScene.GeneratePhotoElement.*;
import GroupMoviePhotoScene.GeneratePhotoElement.Character.*;

public class FrozenPhotoFactory implements MoviePhotoFactory{
    @Override
    public MovieScene createScene(String characterName, String background) {
        return null;
    }

    @Override
    public String createLogo() {
        return "FrozenLogo";
    }
}
