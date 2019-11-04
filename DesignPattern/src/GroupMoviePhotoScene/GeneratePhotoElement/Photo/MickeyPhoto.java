package GroupMoviePhotoScene.GeneratePhotoElement.Photo;

import GroupMoviePhotoScene.GeneratePhotoElement.AbstractFactory.*;
import GroupMoviePhotoScene.GeneratePhotoElement.MovieScene;



public class MickeyPhoto implements BasicPhoto {
    private MovieScene mickeyPhotoScene;
    private String background;
    private String logo;


    public MickeyPhoto(String characterName, String background){

        System.out.println("******** Using Abstract Factory Design Pattern in GroupPhotoScene *********");

        MickeyPhotoFactory mickeyPhotoFactory = new MickeyPhotoFactory();

        this.mickeyPhotoScene = mickeyPhotoFactory.createScene(characterName,background);

        this.background = background;

        this.logo = "Mickey";

    }

    public MickeyPhoto(MickeyPhoto originPhoto){
        this.mickeyPhotoScene = originPhoto.mickeyPhotoScene;
        this.background = originPhoto.background;
        this.logo = "Mickey";
    }


    @Override
    public BasicPhoto clone() {

        System.out.println("******** Using Prototype Design Pattern in GroupPhotoScene *********");

        return new MickeyPhoto(this);
    }

    public MovieScene getPhotoScene(){return this.mickeyPhotoScene;}
    public String getBackground(){return this.background;}
    public String getLogo(){return this.logo;}

}
