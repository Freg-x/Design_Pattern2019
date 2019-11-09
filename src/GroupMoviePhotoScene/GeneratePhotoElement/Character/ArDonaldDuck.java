package GeneratePhotoElement.Character;

public class ArDonaldDuck extends MickeyArCharacter {
    public ArDonaldDuck() {
        this.characterName = "DonaldDuck";
    }

    public void pose() {
        System.out.println("******** Using Template Design Pattern in GroupPhotoScene *********");
        System.out.println("DonaldDuck just gave you a \"DonaldDuck\" Pose!");
    }
}
