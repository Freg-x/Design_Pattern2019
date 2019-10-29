package GeneratePhotoElement.Photo;

import GeneratePhotoElement.AbstractFactory.*;
import GeneratePhotoElement.MovieScene;



public class FrozenPhoto implements BasicPhoto {
    private MovieScene frozenPhotoScene;
    private String background;
    private String logo;


    public FrozenPhoto(String characterName, String background){

        System.out.println("******** Using Abstract Factory Design Pattern in GroupPhotoScene *********");

        FrozenPhotoFactory frozenPhotoFactory = new FrozenPhotoFactory();

        this.frozenPhotoScene = frozenPhotoFactory.createScene(characterName,background);

        this.background = background;

        this.logo = "Frozen";

    }

    public FrozenPhoto(FrozenPhoto originPhoto){
        this.frozenPhotoScene = originPhoto.frozenPhotoScene;
        this.background = originPhoto.background;
        this.logo = "Frozen";
    }


    @Override
    public BasicPhoto clone() {

        System.out.println("******** Using Prototype Design Pattern in GroupPhotoScene *********");

        return new FrozenPhoto(this);
    }

    public MovieScene getPhotoScene(){return this.frozenPhotoScene;}
    public String getBackground(){return this.background;}
    public String getLogo(){return this.logo;}



}

