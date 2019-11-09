package EntertainmentModel.Template;

/**
 * @author zhangyc
 * @date 2019/11/9 19:59
 */

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("-----------TemplateMethodTest start-------------");

        //实例化
        Facility merryGoRound = new Merry_go_round();
        Facility rollerCoasters = new Roller_coasters();
        Facility skyWheel = new Sky_wheel();

        //旋转木马测试
        merryGoRound.FacilityRunTemplate();
        //过山车测试
        rollerCoasters.FacilityRunTemplate();
        //摩天轮测试
        skyWheel.FacilityRunTemplate();
    }
}
