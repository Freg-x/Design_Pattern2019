package ServiceModel;

import ServiceModel.AbstractFactory.*;
import ServiceModel.Facade.Visitors;
import ServiceModel.CompositeAndVisitorAndIterator.Map;
import ServiceModel.StateAndMemento.Questionnaire;

import java.util.Scanner;

//ServiceModel模块测试模板函数
public class ServiceTest {
    public void ModelTest() {
        StoreServiceTest();
        FillQuestionaire();
        UseMapTest();
    }

    //商店服务测试函数模板
    public void StoreServiceTest() {
        System.out.println("Please Input your option(Input'0'to exit!):");
        System.out.println("11:Walmart purchases mineral water --12:Walmart sells mineral water--13:Walmart purchases chocolate--14:Walmart sells chocolate");
        System.out.println("21:Warson purchases fruit juice --22:Warson sells fruit juice --23:Warson purchases ice cream--24:Warson sells ice cream ");

        while (true) {
            Scanner sc = new Scanner(System.in);
            int OpNumber = sc.nextInt();

            if (OpNumber == 11) {
                EatingFactory factory;
                Drink drink;
                factory = new WemStore();
                drink = factory.newDrink();
                drink.Import();
            } else if (OpNumber == 12) {
                EatingFactory factory;
                Drink drink;
                factory = new WemStore();
                drink = factory.newDrink();
                drink.Sell();
            } else if (OpNumber == 13) {
                EatingFactory factory;
                Snacks snacks;
                factory = new WemStore();
                snacks = factory.newSnacks();
                snacks.Import();
            } else if (OpNumber == 14) {
                EatingFactory factory;
                Snacks snacks;
                factory = new WemStore();
                snacks = factory.newSnacks();
                snacks.Sell();
            } else if (OpNumber == 21) {
                EatingFactory factory;
                Drink drink;
                factory = new WsStore();
                drink = factory.newDrink();
                drink.Import();
            } else if (OpNumber == 22) {
                EatingFactory factory;
                Drink drink;
                factory = new WsStore();
                drink = factory.newDrink();
                drink.Sell();
            } else if (OpNumber == 23) {
                EatingFactory factory;
                Snacks snacks;
                factory = new WsStore();
                snacks = factory.newSnacks();
                snacks.Import();
            } else if (OpNumber == 24) {
                EatingFactory factory;
                Snacks snacks;
                factory = new WsStore();
                snacks = factory.newSnacks();
                snacks.Sell();
            } else if (OpNumber == 0) {

                System.out.print("exit!");
                break;
            } else {
                System.out.println("Incorrect Order!");
            }

        }

    }

    //问卷服务测试函数模板
    public void FillQuestionaire() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.fillInQuestionnaire();
    }

    public void TourPackTest() {
        Visitors v = new Visitors();
        System.out.println("Select TourPack one:");
        v.chooseTP(1);
        System.out.println("Select TourPack two:");
        v.chooseTP(2);
    }

    //地图服务测试函数模板
    public void UseMapTest() {
        Map map = new Map();
        //展示所有景点信息
        map.showAllInfo();
        //获得指定景点信息
        map.getInfo("Dream World");
        map.getInfo("Marvel Hero Headquarters");
        map.getInfo("Magic Garden");
        map.getInfo("Advanture Island");
        //对指定景点打卡，包括打卡主题区与具体景点
        map.RecoedVisted("Dream World");
        map.RecoedVisted("Treasure Bay");
        //评论指定景点
        map.CommentOnSpot("Dream World");
        map.CommentOnSpot("Advanture Island");
        map.CommentOnSpot("Magic Garden");
        //再次评论景点获取指定景点评论
        map.CommentOnSpot("Dream World");
        map.getComment("Dream World");
    }
}

