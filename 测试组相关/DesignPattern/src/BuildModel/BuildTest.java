package BuildModel;

import BuildModel.BuilderAndPrototype.*;
import BuildModel.Factory.CarouseFactory;
import BuildModel.Factory.Rides;
import BuildModel.Factory.RidesFactory;
import BuildModel.Factory.SwitchbackFactory;
import BuildModel.Flyweight.ViewSpot;
import BuildModel.Flyweight.ViewSpotTypeFactory;
import BuildModel.Singlon.Casino;

import java.util.Scanner;

//BuildModel模块测试函数模板
public class BuildTest {

    public void ModelTest() {
        Casino casino = this.BuildCasino();
        Dorm dorm = this.BuildDorm();
        Spot spot = this.BuildSpot();
        FlyweightTest();
        FactoryTest();
    }

    public Casino BuildCasino() {
        return Casino.getInstance();
    }//建造游乐园，如果已经存在，则返回实例

    public Dorm BuildDorm() {//建造宿舍
        //雇佣建筑工人
        BuildingWordker worker = new BuildingWordker();
        //修建新宿舍
        Dorm NewDorm = (Dorm) worker.Build(new DormBuilder());
        System.out.println("This is A New Dorm :\n" + NewDorm.CheckBuilding());
        return NewDorm;
    }

    public Spot BuildSpot() {//建造景点
        //雇佣建筑工人
        BuildingWordker worker = new BuildingWordker();
        //修建新的娱乐景点
        Spot NewSpot = (Spot) worker.Build(new SpotBuilder());
        System.out.println("This is A new Spot :\n" + NewSpot.CheckBuilding());
        return NewSpot;
    }

    public void FlyweightTest() {//测试Flyweight
        ViewSpot vs = new ViewSpot("FamilyMart", ViewSpotTypeFactory.getViewSpotType("Shopping"));
        vs.printInfo();
        vs = new ViewSpot("KFC", ViewSpotTypeFactory.getViewSpotType("Diet"));
        vs.printInfo();
        vs = new ViewSpot("Mcdonald", ViewSpotTypeFactory.getViewSpotType("Diet"));
        vs.printInfo();
        vs = new ViewSpot("Ferris wheel", ViewSpotTypeFactory.getViewSpotType("Amusement Facility"));
        vs.printInfo();
        vs = new ViewSpot("Souvenir shop", ViewSpotTypeFactory.getViewSpotType("Shopping"));
        vs.printInfo();
        vs = new ViewSpot("Roller Coaster", ViewSpotTypeFactory.getViewSpotType("Amusement Facility"));
        vs.printInfo();
    }

    public void FactoryTest() {//测试工厂模式和抽象工厂模式
        System.out.println("Please Input your Options(Input'0'to exit!):");
        System.out.println("1:Create Casino --11:Create Switchback--12:Create Carouse ");
        Scanner sc = new Scanner(System.in);
        while (true) {

            int OpNumber = sc.nextInt();
            if (OpNumber == 1) {
                Casino casino = Casino.getInstance();
                casino.getName();
            } else if (OpNumber == 11) {
                RidesFactory factory;
                Rides rides;
                factory = new SwitchbackFactory();
                rides = factory.AddRides();
                rides.Play();

            } else if (OpNumber == 12) {
                RidesFactory factory;
                Rides rides;
                factory = new CarouseFactory();
                rides = factory.AddRides();
                rides.Play();

            } else if (OpNumber == 0) {

                System.out.print("Exit!");
                break;
            } else {
                System.out.println("Incorrect Order!");
            }
        }

    }
}