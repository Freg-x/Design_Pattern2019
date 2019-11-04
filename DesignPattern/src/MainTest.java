import BabyCareCenterScene.MediatorTest;
import BlindHelpScene.AdapterAndTemplateMethodTest;
import DefineSyntax.DefineSyntaxTest;
import FacilityFilter.FacilityFilterTest;
import GateScene.CorAndIteratorTest;
import GateScene.IteratorTest;
import GroupMoviePhotoScene.GroupPhotoTest;
import HotelScene.CommandTest;
import HotelScene.MementoTest;
import PerformCharacterFactory.FactoryMethodTest;
import RestaurantScene.FacadeTest;
import RestaurantScene.Main;

import Ticket.VisitorTest;

public class MainTest {
    public static void main(String[] args){
        String[] testStrings = new String[1];
        MediatorTest.main(testStrings);
        AdapterAndTemplateMethodTest.main(testStrings);
        DefineSyntaxTest.main(testStrings);
        FacilityFilterTest.main(testStrings);
        CorAndIteratorTest.main(testStrings);
        IteratorTest.main(testStrings);
        GroupPhotoTest.main(testStrings);
        CommandTest.main(testStrings);
        MementoTest.main(testStrings);
        FactoryMethodTest.main(testStrings);
        FacadeTest.main(testStrings);
        Main.main(testStrings);
        VisitorTest.main(testStrings);



    }
}
