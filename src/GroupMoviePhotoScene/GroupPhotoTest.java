import GeneratePhotoElement.AbstractFactory.MickeyPhotoFactory;
import GeneratePhotoElement.MovieScene;
import GeneratePhotoElement.PhotoUser.*;
import GeneratePhotoElement.ArPhotoRoom.*;

/*
* A GroupPhoto Scene
* Including Proxy/Bridge/Abstract Factory/State
* In this test, create one single room and user and generate a photo process
* @version 0.2
* @author Freakx
* */


public class GroupPhotoTest {
    public static void main(String[] args){

        ProxyPhotoRoom test_room = new ProxyPhotoRoom();
        User test_usr = new User();
        test_usr.request(test_room);

        MickeyPhotoFactory MickeyFac = new MickeyPhotoFactory();
        MovieScene test1 = MickeyFac.createScene("MickeyMouse","photowithmickey!");
        String testlogo = MickeyFac.createLogo();

        System.out.println("the processed logo is "+testlogo);
        System.out.println("the processed character is "+test1.getMainCharacter().getCharacterName());
        System.out.println("the processed background is "+test1.getBackground());

        test_usr.request(test_room);
        test_usr.request(test_room);
        test_usr.request(test_room);




    }
}
