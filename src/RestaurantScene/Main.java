import Builder.*;
import Composite.*;
import Factory.*;
import Flyweight.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //rice--0
        //pizza--1
        //drink--2
        //noodle--3
        //dishes--4
        //humberger--5
        System.out.println("******  Following Shows A Brief Description Of Composite Pattern  ******");
        System.out.println("MenuParts form the full Menu");
        System.out.println("Menuparts will be created automatically when a new Menu instance is created and the contents will be initialised");
        Menu menu = new Menu();
        System.out.println("You can ask function dispaly() to get the full menu");
//        menu.addFood(simpleFoodFactory.createFood("chicken humberger",14,"Humberger"));
//        menu.display();

        System.out.println();

        System.out.println("******  Following Shows A Brief Description Of Factory Pattern  ******");
        SimpleFoodFactory simpleFoodFactory = new SimpleFoodFactory();
        System.out.println("If you want to add some new food to you restaurant,you can ask createFood() to realise it.");

        System.out.println();

        System.out.println("******  Following Shows A Brief Description Of Builder Pattern  ******");
        OrderDirector orderDirector = new OrderDirector();

        System.out.println();

        System.out.println("******  Following Shows A Brief Description Of Flyweight Pattern  ******");
        FlyweightOrderFactory flyweightOrderFactory = new FlyweightOrderFactory();

    }
}
