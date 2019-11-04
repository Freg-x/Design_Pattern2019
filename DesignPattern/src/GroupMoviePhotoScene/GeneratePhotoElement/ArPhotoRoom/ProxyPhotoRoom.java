package GroupMoviePhotoScene.GeneratePhotoElement.ArPhotoRoom;
import GroupMoviePhotoScene.GeneratePhotoElement.PhotoUser.*;



public class ProxyPhotoRoom implements PhotoRoom {
    private RealPhotoRoom realPhotoRoom;

    private int state;

    public ProxyPhotoRoom(){

        System.out.println("******** Using Proxy Design Pattern in GroupPhotoScene ******** ");

        realPhotoRoom = new RealPhotoRoom();
        state = 0;
    }

    @Override
    public void shot(){
        if(realPhotoRoom == null)realPhotoRoom = new RealPhotoRoom();
        realPhotoRoom.shot();
    };

    @Override
    public void produce() {
        if(realPhotoRoom == null)realPhotoRoom = new RealPhotoRoom();
        realPhotoRoom.produce();
    }

    public int getState(){return this.state;}

    /** Help to resolve the state of a realRoom
     * react due to the state of a user and itselg
     * @param user
     *        the proxied user
    * */

    public void proxy(User user){
        if(this.state == 0 && user.getCur_state().getStateName().equalsIgnoreCase("Apply")){
            this.shot();
            this.state = 1;
        }
        else if(user.getCur_state().getStateName().equalsIgnoreCase("End")){
            this.produce();
            this.state = 0;
        }
        else if(user.getCur_state().getStateName().equalsIgnoreCase("Wait")){
            System.out.println("You are still waiting...");
        }
        else if(this.state == 1 && user.getCur_state().getStateName().equalsIgnoreCase("Apply")){
            System.out.println("Already full!");
        }

    }
}
