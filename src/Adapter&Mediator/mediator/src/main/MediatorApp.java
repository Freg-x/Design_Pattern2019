package main;

import java.util.ArrayList;
import java.util.List;

public class MediatorApp {
    public static void main(String[] args) {
        List<Colleague> colleagueList = new ArrayList<>();

        BabyCareCenter babyCareCenter = new BabyCareCenter();
        Parent parent = new Parent("Mark", "Kian", ColleagueState.SEPARATION);
        Parent parent1 = new Parent("Shane", "Nicky", ColleagueState.SEPARATION);
        Baby baby = new Baby("Kian", "Mark", ColleagueState.SEPARATION);
        Baby baby1 = new Baby("Bryan", "Shane", ColleagueState.SEPARATION);

        System.out.println("Welcome to DisneyLand! Please take care of your children!\n");

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
