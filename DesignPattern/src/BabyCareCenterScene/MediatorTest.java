package BabyCareCenterScene;

import BabyCareCenterScene.Mediator.*;
import java.util.List;

public class MediatorTest {
	public static void main(String[] args) {
        System.out.println("------------Mediator test in BabyCareCenterScene------------");

        List<Colleague> colleagueList;

        BabyCareCenter babyCareCenter = new BabyCareCenter();

        // Mark和Kian是一家人
        Parent parent = new Parent("Mark", "Kian", ColleagueState.SEPARATION);

        // Shane有个孩子叫Nicky，Nicky与Shane走散了
        Parent parent1 = new Parent("Shane", "Nicky", ColleagueState.SEPARATION);
        Baby baby = new Baby("Kian", "Mark", ColleagueState.SEPARATION);

        // Bryan的父亲叫Shane，和上面的Shane同名，Bryan和Shane走散了
        Baby baby1 = new Baby("Bryan", "Shane", ColleagueState.SEPARATION);

        System.out.println("Welcome to DisneyLand! Please take care of your children!\n");

        //走失儿童认领处需要登记来访人员信息
        babyCareCenter.register(parent);
        babyCareCenter.register(parent1);
        babyCareCenter.register(baby);
        babyCareCenter.register(baby1);

        colleagueList = babyCareCenter.getColleagues();
        if (colleagueList != null) {
            for (Colleague colleague : colleagueList) {
                if (colleague.getColleagueState() == ColleagueState.SEPARATION)
                    colleague.seekHelp();
            }
            baby.seekHelp();
        }
    }

}
