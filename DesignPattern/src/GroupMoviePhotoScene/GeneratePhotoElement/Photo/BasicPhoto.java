package GroupMoviePhotoScene.GeneratePhotoElement.Photo;

import GroupMoviePhotoScene.GeneratePhotoElement.MovieScene;


/** define a Basic photo class applying prototype design pattern
 *  By using clone(), you will not need to know what exactly the request class is
 * @author Frea
 * */


public interface BasicPhoto {
   BasicPhoto clone();
   MovieScene getPhotoScene();
   String getBackground();
   String getLogo();

}
