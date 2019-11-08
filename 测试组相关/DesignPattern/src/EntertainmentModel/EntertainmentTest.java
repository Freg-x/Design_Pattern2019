package EntertainmentModel;

import EntertainmentModel.Decorator.OriginalVisitor;
import EntertainmentModel.Decorator.Superman;
import EntertainmentModel.Decorator.Visitor;
import EntertainmentModel.Decorator.Witch;
import EntertainmentModel.Template.Facility;
import EntertainmentModel.Template.Merry_go_round;
import EntertainmentModel.Template.Roller_coasters;
import EntertainmentModel.Template.Sky_wheel;
//EntertainmentModel模块函数
public class EntertainmentTest {
    public void ModelTest(){
        DecoratorTest();
        TemplateTest();
    }
    //换装游行测试模板
    public void DecoratorTest(){
        Visitor p=new OriginalVisitor();
        p.display();
        System.out.println("--------");
        Visitor p2=new Superman(p);
        p2.display();
        System.out.println("--------");
        Visitor p3=new Witch(p);
        p3.display();
    }
    public void TemplateTest(){
        //测试模板方法模式
        //旋转木马
        Facility merry_go_round=new Merry_go_round();
        merry_go_round.FacilityRunTemplate();
        //过山车
        Facility roller_coasters=new Roller_coasters();
        roller_coasters.FacilityRunTemplate();
        //摩天轮
        Facility sky_wheel=new Sky_wheel();
        sky_wheel.FacilityRunTemplate();
    }
}
