package CommandandMemento.command;

import java.util.Vector;

public class Invoker {
    private Vector<CheckFull> orderList = new Vector<>();

    public void addCheck(CheckFull checkFull){
        orderList.add(checkFull);
    }

    public void launchCheck(){
        System.out.println("\n\n------------Command test------------");
        System.out.println("We will check the room one by one");
        for(CheckFull checkFull : orderList){
            checkFull.check();
        }
    }
}
