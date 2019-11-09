package GeneratePhotoElement;

import GeneratePhotoElement.AbstractFactory.MoviePhotoFactory;
import GeneratePhotoElement.Character.DisneyArCharacter;

/**
 * Define how a scene is composed
 * including one mainCharacter and background word
 *
 * @author Freakx
 */

public class MovieScene {

    protected DisneyArCharacter mainCharacter;
    protected String background;

    public MovieScene(DisneyArCharacter initCharacter, String initBackground) {

        System.out.println("******** Using Bridge Design Pattern in GroupPhotoScene *********");

        this.mainCharacter = initCharacter;
        this.background = initBackground;
    }

    public DisneyArCharacter getMainCharacter() {
        return this.mainCharacter;
    }

    public String getBackground() {
        return this.background;
    }


}
