package GeneratePhotoElement.ArPhotoRoom;

public class RealPhotoRoom implements PhotoRoom {
    @Override
    public void shot() {
        System.out.println("You have took a photo!");
    }

    @Override
    public void produce() {
        System.out.println("You have produced a photo!");
    }
}
