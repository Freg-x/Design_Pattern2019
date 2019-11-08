package ServiceModel.CompositeAndVisitorAndIterator;

import java.util.Iterator;
import java.util.Scanner;
//评论Visitor类
public class CommentVisitor extends Visitor {
    @Override
    //对具体景点的评价
    public void visit(ScenicSpot scenicspot) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Visitor:visit():Please input your comments on "+scenicspot.getName());
        String s=scanner.nextLine();
        scenicspot.getCommentslist().add(s);
        scenicspot.showComments();

    }
    @Override
    //对主题园区的评价
    public void visit(ThemeDistrict themeDistrict) {
        Iterator iterator=themeDistrict.getthemedistrict().iterator();
        while(iterator.hasNext())
        {
            Spots spot=(Spots)iterator.next();
            if(spot instanceof ScenicSpot)
            {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Visitor:visit():Please input your comments on "+spot.getName());
                String s=scanner.nextLine();
                ScenicSpot scenicspot=(ScenicSpot)spot;
                scenicspot.getCommentslist().add(s);
            }
            else if(spot instanceof ThemeDistrict)
            {
                ThemeDistrict themedistrict=(ThemeDistrict)spot;
                visit(themedistrict);
            }
        }
       themeDistrict.showComments();
    }
}
