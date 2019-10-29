package GeneratePhotoElement.PhotoUser;
import GeneratePhotoElement.ArPhotoRoom.*;





public class User {
    private UserState cur_state;

    public User(){
        System.out.println("******** Using State Design Pattern in GroupPhotoScene *********");
        cur_state = new WaitState();}

    public void setState(UserState state){this.cur_state = state;};

    public UserState getCur_state(){return this.cur_state;};

    public void request(ProxyPhotoRoom room){
        cur_state.request(this,room);
    }

}
