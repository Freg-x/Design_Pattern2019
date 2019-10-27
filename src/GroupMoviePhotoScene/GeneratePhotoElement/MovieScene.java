package GeneratePhotoElement;

import GeneratePhotoElement.Character.DisneyArCharacter;

public class MovieScene {
    protected DisneyArCharacter mainCharacter;
    protected String background;
    public MovieScene(DisneyArCharacter initCharacter, String initBackground){
        this.mainCharacter = initCharacter;
        this.background = initBackground;
    }

    public DisneyArCharacter getMainCharacter(){return this.mainCharacter;}

    public String getBackground(){return this.background;}

}
